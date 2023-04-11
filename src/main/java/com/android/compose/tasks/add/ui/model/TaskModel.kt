package com.android.compose.tasks.add.ui.model

data class TaskModel(
    val id: Int = System.currentTimeMillis().hashCode(),
    val name: String,
    var selected: Boolean = false
)
