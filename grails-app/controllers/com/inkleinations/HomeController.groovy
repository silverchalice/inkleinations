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

    def links() { }

    def contact() { }

}
