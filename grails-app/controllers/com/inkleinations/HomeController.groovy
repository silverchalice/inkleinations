package com.inkleinations

class HomeController {

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

    def contact() { }

}
