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
        "/publishing/$tag"{
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
        "/seek-ye-first"{
            controller = "home"
            action = "first"
        }
        "/bible-copy"{
            controller = "home"
            action = "bible"
        }
        "/missionary-books"{
            controller = "home"
            action = "missionary"
        }
        "/audio"{
            controller = "home"
            action = "audio"
        }
        "/links"{
            controller = "home"
            action = "links"
        }
        "/sessions"{
            controller = "home"
            action = "conference_sessions"
        }
        "/contact"{
            controller = "home"
            action = "contact"
        }

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
