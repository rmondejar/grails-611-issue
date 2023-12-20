package com.example

class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // OAuth URLs
        "/oauth/$provider/success"(controller: "OAuth", action: 'success')
        "/oauth/$provider/failure"(controller: "OAuth", action: 'failure')
        "/oauth/$provider/callback"(controller: "OAuth", action: 'callback')
        "/oauth/$provider/finish"(controller: "OAuth", action: 'finish')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
