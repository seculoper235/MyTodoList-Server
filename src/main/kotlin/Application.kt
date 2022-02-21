package com.example

import com.example.com.example.service.testServices
import com.example.plugins.*
import com.example.route.itemRoutes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.ktor.server.routing.*
import org.kodein.di.bind
import org.kodein.di.ktor.di
import org.kodein.di.singleton

fun Application.module() {
    di {
        bind {
            singleton {
                environment.config
            }
        }

        importOnce(testServices)
    }

    install(AutoHeadResponse)

    install(CORS) {
        host("*")
        header(HttpHeaders.ContentType)
    }
    configureSerialization()

    routing {
        // 투두 아이템
        itemRoutes()
    }
}

