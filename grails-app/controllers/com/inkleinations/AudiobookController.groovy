package com.inkleinations

import org.springframework.dao.DataIntegrityViolationException

class AudiobookController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [audiobookInstanceList: Audiobook.list(params), audiobookInstanceTotal: Audiobook.count()]
    }

    def create() {
        [audiobookInstance: new Audiobook(params)]
    }

    def save() {
        def audiobookInstance = new Audiobook(params)
		def audiobook = request.getFile('audiobook')
        def tags = params.tags.split(", ") as List
        audiobookInstance.bookName = audiobook.getOriginalFilename()
        if (audiobook.empty || !audiobookInstance.save(flush: true)) {
            render(view: "create", model: [audiobookInstance: audiobookInstance])
            return
        }

        String root = "${request.getSession().getServletContext().getRealPath('/')}"
        new File("${root}/audio").mkdirs()
        audiobook.transferTo(new File("${root}/audio" + File.separatorChar + audiobook.getOriginalFilename()))								             			     	
        audiobookInstance.setTags(tags)

        audiobookInstance.save()

		flash.message = message(code: 'default.created.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), audiobookInstance.id])
        redirect(action: "show", id: audiobookInstance.id)
    }

    def show() {
        def audiobookInstance = Audiobook.get(params.id)
        if (!audiobookInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "list")
            return
        }

        [audiobookInstance: audiobookInstance]
    }

    def edit() {
        def audiobookInstance = Audiobook.get(params.id)
        if (!audiobookInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "list")
            return
        }

        [audiobookInstance: audiobookInstance, audiobookTags: audiobookInstance.tags?.join(", ")]

    }

    def update() {
        def audiobookInstance = Audiobook.get(params.id)
        def tags = params.tags.split(", ") as List
        if (!audiobookInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (audiobookInstance.version > version) {
                audiobookInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'audiobook.label', default: 'Audiobook')] as Object[],
                          "Another user has updated this Audiobook while you were editing")
                render(view: "edit", model: [audiobookInstance: audiobookInstance])
                return
            }
        }

        audiobookInstance.properties = params
        audiobookInstance.tags = null

        if (!audiobookInstance.save(flush: true)) {
            render(view: "edit", model: [audiobookInstance: audiobookInstance])
            return
        }

        audiobookInstance.setTags(tags)
        audiobookInstance.save()

		flash.message = message(code: 'default.updated.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), audiobookInstance.id])
        redirect(action: "show", id: audiobookInstance.id)
    }

    def delete() {
        def audiobookInstance = Audiobook.get(params.id)
        if (!audiobookInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "list")
            return
        }

        try {
            audiobookInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'audiobook.label', default: 'Audiobook'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
