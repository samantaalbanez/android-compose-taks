package com.android.compose.tasks.add.domain

import com.android.compose.tasks.add.data.TaskRepository
import com.android.compose.tasks.add.ui.model.TaskModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke(): Flow<List<TaskModel>> =
        taskRepository.tasks
}
