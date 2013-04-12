package com.inkleinations

import org.grails.taggable.*

class Publication implements Taggable {

    String title
    String author
    String description
    Integer pages
    Integer priority = 10000
    String imageName
    String pdfName
    String slug
    String body

    static constraints = {
        title nullable: false, blank: false
        author nullable: false, blank: false
        description nullable: true, blank: true, maxSize:50000
        pages nullable: false, blank: false
        imageName nullable: true, blank: true
        pdfName nullable: true, blank: true
        slug nullable: false, blank: false, unique: true
        body nullable: true, blank: true
    }

    static mapping = {
        description type: 'text'
        body type: 'text'
    }

}
