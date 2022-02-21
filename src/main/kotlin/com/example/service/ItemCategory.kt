package com.example.com.example.service

import com.example.model.TodoItem

interface ItemCategory {

    fun getOne(id: Int): TodoItem

    fun findAllItems(): List<TodoItem>

    fun findSomeItems(completed: Boolean): List<TodoItem>
}