package com.inkleinations

import org.springframework.dao.DataIntegrityViolationException

class TalkController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [talkInstanceList: Talk.list(params), talkInstanceTotal: Talk.count()]
    }

    def create() {
        [talkInstance: new Talk(params)]
    }

    def save() {
        def talkInstance = new Talk(params)
		def talk = request.getFile('talk')
        def tags = params.tags.split(", ") as List
        talkInstance.talkName = talk.getOriginalFilename()
        if (talk.empty || !talkInstance.save(flush: true)) {
            render(view: "create", model: [talkInstance: talkInstance])
            return
        }

        String root = "${request.getSession().getServletContext().getRealPath('/')}"
        new File("${root}/audio").mkdirs()
        talk.transferTo(new File("${root}/audio" + File.separatorChar + talk.getOriginalFilename()))								             			     	
        talkInstance.setTags(tags)

        talkInstance.save()

		flash.message = message(code: 'default.created.message', args: [message(code: 'talk.label', default: 'Talk'), talkInstance.id])
        redirect(action: "show", id: talkInstance.id)
    }

    def show() {
        def talkInstance = Talk.get(params.id)
        if (!talkInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "list")
            return
        }

        [talkInstance: talkInstance]
    }

    def edit() {
        def talkInstance = Talk.get(params.id)
        if (!talkInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "list")
            return
        }

        [talkInstance: talkInstance, talkTags: talkInstance.tags?.join(", ")]
    }

    def update() {
        def talkInstance = Talk.get(params.id)
        def tags = params.tags.split(", ") as List
        if (!talkInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (talkInstance.version > version) {
                talkInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'talk.label', default: 'Talk')] as Object[],
                          "Another user has updated this Talk while you were editing")
                render(view: "edit", model: [talkInstance: talkInstance])
                return
            }
        }

        talkInstance.properties = params
        talkInstance.tags = null

        if (!talkInstance.save(flush: true)) {
            render(view: "edit", model: [talkInstance: talkInstance])
            return
        }

        talkInstance.setTags(tags)
        talkInstance.save()

		flash.message = message(code: 'default.updated.message', args: [message(code: 'talk.label', default: 'Talk'), talkInstance.id])
        redirect(action: "show", id: talkInstance.id)
    }

    def delete() {
        def talkInstance = Talk.get(params.id)
        if (!talkInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "list")
            return
        }

        try {
            talkInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'talk.label', default: 'Talk'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
