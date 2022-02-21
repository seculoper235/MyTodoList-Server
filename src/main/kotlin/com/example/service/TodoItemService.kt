package com.example.service

import com.example.com.example.service.ItemCategory
import com.example.model.TodoItem
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

class TodoItemService: ItemCategory {
    companion object {
        val module = DI.Module(ItemCategory::class.simpleName!!) {
            bind<ItemCategory>() with singleton {
                TodoItemService()
            }
        }
    }

    override fun getOne(id: Int): TodoItem {
        TODO("Not yet implemented")
    }

    override fun findAllItems(): List<TodoItem> {
        TODO("Not yet implemented")
    }

    override fun findSomeItems(completed: Boolean): List<TodoItem> {
        TODO("Not yet implemented")
    }
}