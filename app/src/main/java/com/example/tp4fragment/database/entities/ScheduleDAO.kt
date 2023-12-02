package com.example.tp4fragment.database.entities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao()
interface ScheduleDAO {
    @Query("select * from schedule order by arrival_time")
    fun getAl(): LiveData<List<Schedule>>

    @Query("select * from schedule where stop_name=:stopname")
    fun getByStopName(stopname : String): LiveData<List<Schedule>>

}