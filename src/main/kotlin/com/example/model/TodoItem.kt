package com.example.model

import com.example.com.example.model.TodoText
import kotlinx.serialization.Serializable


@Serializable
data class TodoItem (
    val id: Int,
    val text: TodoText,
    var completed: Boolean = false
)