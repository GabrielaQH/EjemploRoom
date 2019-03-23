package com.edu.uabc.appm.ejemploroom.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "task_entity")
data class TaskEntity (
  @PrimaryKey(autoGenerate = true)
  var id:Int,
  var name:String,
  var isDone:Boolean = false
)

