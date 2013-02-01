package com.inkleinations

class Audiobook {

    String title
    String author
    String reader
    String time
    Integer priority = 10000
    String description
    String bookName

    static constraints = {
        description blank: true, nullable: true, maxSize: 50000
    }

    static mapping = {
        description type: 'text'
    }
}
