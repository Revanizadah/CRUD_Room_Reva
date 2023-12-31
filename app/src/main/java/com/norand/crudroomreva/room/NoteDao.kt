package com.norand.crudroomreva.room

import androidx.room.*

@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note:Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getNote(): List<Note>

    @Query("SELECT * FROM note WHERE id=:node_id")
    suspend fun getNote(note_id: Int): List<Note>
}