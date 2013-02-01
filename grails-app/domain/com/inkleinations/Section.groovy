package com.inkleinations

class Section {

    String name
    String html

    static constraints = {
        name blank: false, null: false, unique: true
        html blank: true, null: true
    }

    static mapping = {
        html type: 'text'
    }

}
