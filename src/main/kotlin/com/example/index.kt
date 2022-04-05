package com.example

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Application.index() {
    routing {
        get("/") {
            call.respondHtml {
                head {
                    title { + "Welcome to Songs of the Eons"}
                    styleLink("resources/style.css")
                    script { src = "resources/script.js" }
                }
                body {
                    h1 { +"Your home for SOTE news"}
                    h2 { +"Top downloaded raws of the week"}
                    a("/login") {+"Login here"}
                    a("/create-account") {+"Or create an account with us!"}
                }
            }
        }
    }
}