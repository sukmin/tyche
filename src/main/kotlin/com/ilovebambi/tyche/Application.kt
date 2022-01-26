package com.ilovebambi

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.ilovebambi.tyche.plugins.*
import com.ilovebambi.tyche.plugins.configureRouting

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
