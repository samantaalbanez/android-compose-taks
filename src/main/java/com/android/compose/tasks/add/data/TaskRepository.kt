package com.android.compose.tasks.add.data

import com.android.compose.tasks.add.ui.model.TaskModel
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@Singleton
class TaskRepository @Inject constructor(private val taskDao: TaskDao) {

    val tasks: Flow<List<TaskModel>> = taskDao.getTasks().map {
        items -> items.map {
            TaskModel(
                id = it.id,
                name = it.name,
                selected = it.selected
            )
        }
    }

    fun add(taskModel: TaskModel) {
        taskDao.addTask(
            taskModel.toData()
        )
    }

    fun update(taskModel: TaskModel) {
        taskDao.updateTask(
            taskModel.toData()
        )
    }

    fun delete(taskModel: TaskModel) {
        taskDao.deleteTask(
            taskModel.toData()
        )
    }
}

fun TaskModel.toData(): TaskEntity =
    TaskEntity(this.id, this.name, this.selected)
