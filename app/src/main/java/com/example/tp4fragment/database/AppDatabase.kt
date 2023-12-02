package com.example.tp4fragment.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tp4fragment.database.entities.ScheduleDAO

abstract class AppDatabase : RoomDatabase(){
    abstract fun scheduleDao(): ScheduleDAO

    companion object{
        @Volatile
        private var instance: AppDatabase? = null
        fun getDataBase (context:Context): AppDatabase{
            return (instance ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "bus_schedule_database"
                ).createFromAsset("database/bus_schedule.db")
                    .build()
            }) as AppDatabase
        }
    }
}