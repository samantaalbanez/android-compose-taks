package com.android.compose.tasks.add.data.di

import android.content.Context
import androidx.room.Room
import com.android.compose.tasks.add.data.TaskDao
import com.android.compose.tasks.add.data.TasksDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun provideTasksDao(tasksDataBase: TasksDataBase): TaskDao =
        tasksDataBase.taskDao()

    @Provides
    @Singleton
    fun provideTasksDatabase(@ApplicationContext appContext: Context): TasksDataBase =
        Room.databaseBuilder(
            context = appContext,
            klass = TasksDataBase::class.java,
            name = "TasksDataBase"
        ).allowMainThreadQueries().build()
}
