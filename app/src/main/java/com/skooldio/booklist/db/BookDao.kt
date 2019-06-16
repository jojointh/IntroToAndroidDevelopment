package com.skooldio.booklist.db

import androidx.room.*
import com.skooldio.booklist.vo.Book

@Dao
interface BookDao {
    @Query("SELECT * FROM book_list WHERE isbn = :isbn LIMIT 1")
    fun getBookByIsbn(isbn: String?): Book

    @Query("SELECT * FROM book_list WHERE author = :author")
    fun getBookByAuthor(author: String?): List<Book>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBook(book: Book)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBooks(vararg book: Book)

    @Delete
    fun deleteBook(book: Book)

    @Update
    fun updateBook(book: Book)
}
