package com.inkleinations

class Talk {

    String title
    String name
    String description
    String time 
    Integer priority = 10000
    String talkName

    static constraints = {
        description blank: true, nullable: true, maxSize: 50000
    }

    static mapping = {
        description type: 'text'
    }
}
