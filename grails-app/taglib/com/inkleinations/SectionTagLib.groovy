package com.inkleinations

class SectionTagLib {

    static namespace = "section"

    def content = { attrs ->
        out << Section.findByName(attrs.for)?.html ?: ""
    }

}
