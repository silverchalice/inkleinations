package com.inkleinations

class SectionTagLib {

    static namespace = "section"

    def content = { attrs ->
        out << Section.findByName(attrs.for)?.html ?: ""
    }

    def image = { attrs ->
        def section = Section.findByName(attrs.for)
        if(section){
            def src = g.resource(dir: attrs.dir ? 'images' + '/' + attrs.dir : 'images', file: section.html)
            out << '<img src="' + src + '" width="' + attrs.width + '" height="' + attrs.height + '" alt="' + attrs.alt + '" />'
        }
    }

}
