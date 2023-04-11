package com.android.compose.tasks.add.domain

import com.android.compose.tasks.add.data.TaskRepository
import com.android.compose.tasks.add.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke(taskModel: TaskModel) =
        taskRepository.add(taskModel)
}
