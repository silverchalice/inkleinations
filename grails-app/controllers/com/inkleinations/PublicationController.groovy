package com.inkleinations

import org.springframework.dao.DataIntegrityViolationException
import org.grails.taggable.*

class PublicationController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [publicationInstanceList: Publication.list(params), publicationInstanceTotal: Publication.count()]
    }

    def create() {
        [publicationInstance: new Publication(params)]
    }

    def save() {
        def publicationInstance = new Publication(params)
		def image = request.getFile('image')
		def pdf = request.getFile('pdf')
        def tags = params.tags.split(", ") as List
        publicationInstance.imageName = image.getOriginalFilename()
        publicationInstance.pdfName = pdf.getOriginalFilename()
        if (image.empty || pdf.empty || !publicationInstance.save(flush: true)) {
            render(view: "create", model: [publicationInstance: publicationInstance])
            return
        }

        String root = "${request.getSession().getServletContext().getRealPath('/')}"
        new File("${root}/covers").mkdirs()
        new File("${root}/pdf").mkdirs()
        image.transferTo(new File("${root}/covers" + File.separatorChar + image.getOriginalFilename()))								             			     	
        pdf.transferTo(new File("${root}/pdf" + File.separatorChar + pdf.getOriginalFilename()))								             			     	
        publicationInstance.setTags(tags)

        publicationInstance.save()

		flash.message = message(code: 'default.created.message', args: [message(code: 'publication.label', default: 'Publication'), publicationInstance.id])
        redirect(action: "show", id: publicationInstance.id)
    }

    def show() {
        def publicationInstance = Publication.get(params.id)
        if (!publicationInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "list")
            return
        }

        [publicationInstance: publicationInstance]
    }

    def edit() {
        def publicationInstance = Publication.get(params.id)
        if (!publicationInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "list")
            return
        }

        [publicationInstance: publicationInstance, publicationTags: publicationInstance.tags?.join(", ")]
    }

    def update() {
        def publicationInstance = Publication.get(params.id)
        def tags = params.tags.split(", ") as List
        if (!publicationInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (publicationInstance.version > version) {
                publicationInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'publication.label', default: 'Publication')] as Object[],
                          "Another user has updated this Publication while you were editing")
                render(view: "edit", model: [publicationInstance: publicationInstance])
                return
            }
        }

        publicationInstance.properties = params
        publicationInstance.tags = null

        if (!publicationInstance.save(flush: true)) {
            render(view: "edit", model: [publicationInstance: publicationInstance])
            return
        }

        publicationInstance.setTags(tags)
        publicationInstance.save()

		flash.message = message(code: 'default.updated.message', args: [message(code: 'publication.label', default: 'Publication'), publicationInstance.id])
        redirect(action: "show", id: publicationInstance.id)
    }

    def delete() {
        def publicationInstance = Publication.get(params.id)
        if (!publicationInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "list")
            return
        }

        try {
            publicationInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'publication.label', default: 'Publication'), params.id])
            redirect(action: "show", id: params.id)
        }
    }

    def publishing() {
        def publicationInstanceList = null
        def msg = null
        if(params.tag){
           if(!Publication.findAllByTag(params.tag)){
               msg = "Nothing found. &nbsp;&nbsp;" + g.link(controller:"publication", action:"publishing"){ "See all publications" }
           } else {
               msg = "Showing publications tagged &#8220;${params.tag}.&#8221;"
               publicationInstanceList = Publication.findAllByTag(params.tag)
           }
        } else {
            publicationInstanceList = Publication.list(sort: "priority")
        }
        [publicationInstanceList: publicationInstanceList,
         message: msg, currentlyUsedTags: Tag.list(),
         currentTag: params.tag ?: null]
    }

}
