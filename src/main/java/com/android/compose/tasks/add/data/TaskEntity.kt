package com.android.compose.tasks.add.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    var selected: Boolean = false
)
