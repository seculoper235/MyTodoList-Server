package com.example.com.example.service

import com.example.service.TodoItemService
import org.kodein.di.DI

val testServices = DI.Module("testServices") {

    importOnce(TodoItemService.module)
}