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
        "/family"{
            controller = "home"
            action = "family"
        }
        "/contact"{
            controller = "home"
            action = "contact"
        }

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
