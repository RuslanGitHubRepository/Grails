package grails_rest

class UrlMappings {

    static mappings = {
        delete "/$controller/$id"(action:"delete")
        get "/hr_systems/$controller(.$format)?"(action:"index")
        get "/hr_systems/$controller/all"(action:"indexAll")
        get "/hr_systems/$controller/$id"(action:"index")
        post "/hr_systems/$controller"(action:"insert")
        put "/hr_systems/$controller"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}