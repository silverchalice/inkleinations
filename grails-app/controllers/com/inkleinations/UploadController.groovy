package com.inkleinations

class UploadController {

	static transactional = true

    def allowedMethods = []

    def index() { redirect(action: "list", params: params) }

    def list = {
		def fileResourceInstanceList = []
		def f = new File(grailsApplication.config.images.location.toString())
		if(f.exists()){
			f.eachFile(){ file ->
			if(!file.isDirectory())
				fileResourceInstanceList.add(new Expando(name: file.name,
                        used: Section.findByHtml(file.name) ? true: false))
			}
		}
        [fileResourceInstanceList: fileResourceInstanceList]
    }

    def delete = {
		def filename = params.id.replace('###', '.')
		def file = new File(grailsApplication.config.images.location.toString() + File.separatorChar + filename)
		file.delete()
		flash.message = "File ${filename} removed." 
		redirect(action: "list")
    }

	def upload = {
		def f = request.getFile('fileUpload')
	    if(!f.empty) {
	      flash.message = 'Your file has been uploaded.'
		  new File(grailsApplication.config.images.location.toString()).mkdirs()
		  f.transferTo(new File(grailsApplication.config.images.location.toString() + File.separatorChar + f.getOriginalFilename()))								             			     	
        } else {
	       flash.message = 'File cannot be empty.'
	    }
		redirect(action: "list")
	}
}

