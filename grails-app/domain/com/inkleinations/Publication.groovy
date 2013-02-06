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

    static constraints = {
        description nullable: true, blank: true, maxSize:50000
    }

    static mapping = {
        description type: 'text'
    }

}
