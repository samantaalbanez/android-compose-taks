package com.android.compose.tasks.add.ui

import com.android.compose.tasks.add.ui.model.TaskModel

sealed interface TasksUIState {

    object Loading: TasksUIState
    data class Error(val throwable: Throwable): TasksUIState
    data class Success(val tasks: List<TaskModel>): TasksUIState
}
