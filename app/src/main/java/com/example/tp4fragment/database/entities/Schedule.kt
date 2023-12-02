package com.example.tp4fragment.database.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class Schedule(
    @PrimaryKey()
    val id :Int,
    @NonNull()
    @ColumnInfo("stop_name")
    val stopName : String,
    @NonNull()
    @ColumnInfo("arrival_time")
    val arrivalTime : String

){}
