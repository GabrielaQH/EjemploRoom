package com.edu.uabc.appm.ejemploroom.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TasksDatabase : RoomDatabase() {
  abstract fun taskDao(): TaskDao
}
