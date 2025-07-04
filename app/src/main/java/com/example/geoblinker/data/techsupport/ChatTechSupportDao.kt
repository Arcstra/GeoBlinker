package com.example.geoblinker.data.techsupport

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ChatTechSupportDao {
    @Insert
    suspend fun insert(item: ChatTechSupport): Long

    @Query("SELECT * FROM chat_tech_support")
    fun getAll(): Flow<List<ChatTechSupport>>
}