package com.example.route

import com.example.com.example.service.ItemCategory
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.kodein.di.instance
import org.kodein.di.ktor.closestDI

fun Route.itemRoutes() {
    val todoItem by closestDI().instance<ItemCategory>();

    get("/api/todo/all") {
        call.respond(todoItem.findAllItems())
    }

    get("/api/todo/active") {
        call.respond(todoItem.findSomeItems(completed = false))
    }

    get("/api/todo/completed") {
        call.respond(todoItem.findSomeItems(completed = true))
    }
}
