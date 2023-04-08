package com.android.compose.tasks.add.ui.model

data class TaskModel(
    val id: Long = System.currentTimeMillis(),
    val name: String,
    var selected: Boolean = false
)
