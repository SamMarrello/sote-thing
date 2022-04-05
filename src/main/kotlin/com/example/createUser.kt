package com.example

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Application.createUser() {
    routing {
        get("/create-user") {
            call.respondHtml {
                head {
                    title {+""}
                }
            }
        }
    }
}