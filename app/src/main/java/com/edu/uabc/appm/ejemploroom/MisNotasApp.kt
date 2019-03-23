package com.edu.uabc.appm.ejemploroom

import android.app.Application
import android.arch.persistence.room.Room
import com.edu.uabc.appm.ejemploroom.database.TasksDatabase


class MisNotasApp: Application() {

  companion object {
    lateinit var database: TasksDatabase
  }

  override fun onCreate() {
    super.onCreate()
      MisNotasApp.database = Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
  }
}
