package com.inkleinations

import org.apache.commons.validator.EmailValidator 

class HomeController {

    def mailService

    def index() { }

    def family() { }

    def faq() { }

    def audio() {
        [audiobookInstanceList : Audiobook.list(sort: "priority"),
         talkInstanceList : Talk.list(sort: "priority"),
         songInstanceList : Song.list(sort: "priority")]
    }

    def first() { }

    def bible() { }

    def missionary() {
        [audiobookInstanceList : Audiobook.findAllByTag("missions").sort{it.priority},
         talkInstanceList : Talk.findAllByTag("missions").sort{it.priority},
         songInstanceList : Song.findAllByTag("missions").sort{it.priority},
         publicationInstanceList : Publication.findAllByTag("missions").sort{it.priority} ]
    }

    def links() { }

    def contact() {
        def msg = null
        def dateFormat = "EEEE, MMMM d, yyyy, 'at' h:mm a"
        EmailValidator emailValidator = EmailValidator.getInstance() 
        if(request.method == "POST"){
            if(params.message && params.email){
                mailService.sendMail {
                    to "daveanddebklein@yahoo.com"
                    from "inKLEINations.com <inkleinationswebservant@gmail.com>"
                    //bcc "ben@silver-chalice.com"
                    subject "${params.subject} (from inKLEINations.com)"
                    html "<p>On ${g.formatDate(date:new Date(), format: dateFormat)}, ${params.email} said:</p> <p>-----------------------------------------------------------</p> ${params.message.encodeAsHTML()} <p>------------------------------------------------------------</p><p>This is an automated message. Please do not reply to this email. If you need additional help, visit <a href='http://www.apple.com/support/appleid/'>Apple Support</a>.</p>"
                 }
                 msg = "Thank you! Your message has been sent."
            } else if(!params.email){
                msg = "Please enter your email address so that we can respond."
            } else if(params.email && !emailValidator.isValid(params.email)){
                msg = "Please enter a valid email address so that we can respond."
            } else {
                msg = "Please enter a message to send."
            }
        }
        [message: msg]
    }

}
