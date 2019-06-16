package com.skooldio.booklist.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.skooldio.booklist.vo.Book

@Database(
    entities = [Book::class],
    version = 1
)
abstract class BookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}