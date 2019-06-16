package com.skooldio.booklist.db

import android.content.Context
import androidx.room.Room

object DatabaseManager {
    private lateinit var bookDatabase: BookDatabase

    fun init(context: Context) {
        bookDatabase = Room.databaseBuilder(context, BookDatabase::class.java, "book.db").build()
    }

    fun get(): BookDatabase = bookDatabase
}
