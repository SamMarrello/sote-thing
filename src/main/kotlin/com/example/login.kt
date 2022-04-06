package com.example

import com.example.entities.User
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Application.loginRoute() {
    routing {
        get("/login") {
            call.respondHtml {
                head {
                    title { +"Login here" }
                    styleLink("resources/style.css")
                    script(src = "resources/script.js") {}
                }
                body {
                    h1 {
                        +"Please enter your information here"
                    }

                    form {
                        label {
                            +"Username"
                        }
                        input(InputType.text) {

                        }
                        label {
                            +"Password"
                        }
                        input(InputType.password) {

                        }
                        button {
                            +"Login"
                        }
                    }
                }
            }
        }
        post("/login") {
            val user = call.receive<User>()
            println(user)
            call.respondText("Everything Working")
        }
    }
}