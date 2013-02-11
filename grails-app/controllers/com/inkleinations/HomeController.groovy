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

    def conference_sessions() { }

    def contact() {
        def msg = null
        def somethingWentWrong = false
        def firstValue = Math.floor(Math.random() * 9).round() + 1
        def secondValue = Math.floor(Math.random() * 9).round() + 1
        def dateFormat = "EEEE, MMMM d, yyyy, 'at' h:mm a"
        EmailValidator emailValidator = EmailValidator.getInstance() 

        if(request.method == "POST"){
            if(params.message && params.email && emailValidator.isValid(params.email) && params.int('answer') == params.int('firstValue') + params.int('secondValue')){
                mailService.sendMail {
                    to "daveanddebklein@yahoo.com"
                    from "inKLEINations.com <inkleinationswebservant@gmail.com>"
                    //bcc "ben@silver-chalice.com"
                    subject params.subject ? "${params.subject} (from inKLEINations.com)" : "Unspecified message (from inKLEINations.com"
                    html "<p>On ${g.formatDate(date:new Date(), format: dateFormat)}, ${params.email} said:</p> <p>-----------------------------------------------------------</p> ${params.message.encodeAsHTML()} <p>------------------------------------------------------------</p><p>This is an automated message. Please do not reply to this email. If you need additional help, visit <a href='http://www.apple.com/support/appleid/'>Apple Support</a>.</p>"
                 }
                 msg = "Thank you! Your message has been sent."
            } else if(!params.email){
                somethingWentWrong = true
                msg = "Please enter your email address so that we can respond."
            } else if(params.email && !emailValidator.isValid(params.email)){
                somethingWentWrong = true
                msg = "Please enter a valid email address so that we can respond."
            } else if (!params.message){
                somethingWentWrong = true
                msg = "Please enter a message to send."
            } else if(params.int('firstValue') + params.int('secondValue') != params.int('answer')){
                somethingWentWrong = true
                msg = "Sorry &#8212; your answer to the math question was incorrect. Please try again."
            }
        }

        if(somethingWentWrong){
            [msg: msg, firstValue: firstValue, secondValue: secondValue,
             email: params.email ?: "", subject: params.subject ?: "",
             message: params.message ?: ""]
        } else {
            [msg: msg, firstValue: firstValue, secondValue: secondValue]
        }
    }

}
