package com.inkleinations

import org.grails.taggable.*

class Song implements Taggable {

    String title
    String time
    Integer priority = 10000
    String description
    String songName

    static constraints = {
        description blank: true, nullable: true, maxSize: 50000
    }

    static mapping = {
        description type: 'text'
    }
}
