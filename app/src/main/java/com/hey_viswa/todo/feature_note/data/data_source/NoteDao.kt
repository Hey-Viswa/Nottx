package com.hey_viswa.todo.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hey_viswa.todo.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("Select * from note")
    fun getNotes(): Flow<List<Note>>

    @Query("Select * from note where id = :id")
    suspend fun getNoteById(id: Int): Note?  //23.23

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}