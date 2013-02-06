class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/publishing"{
            controller = "publication"
            action = "publishing"
        }
        "/about-us"{
            controller = "home"
            action = "family"
        }
        "/faq"{
            controller = "home"
            action = "faq"
        }
        "/audio"{
            controller = "home"
            action = "audio"
        }
        "/links"{
            controller = "home"
            action = "links"
        }
        "/contact"{
            controller = "home"
            action = "contact"
        }

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
