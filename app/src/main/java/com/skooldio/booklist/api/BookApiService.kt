package com.skooldio.booklist.api

import com.skooldio.booklist.vo.*
import retrofit2.Call
import retrofit2.http.*

interface BookApiService {
    @GET("/api/v1/books")
    fun getAllBooks(@Query("maxCount") maxCount: Int = 10): Call<Books>

    @GET("/api/v1/books/{isbn}")
    fun getBookByIsbn(@Path("isbn") isbn: Long): Call<Book>

    @POST("/api/v1/books")
    fun addNewBook(@Body book: Book): Call<AddBookResult>

    @DELETE("/api/v1/books/{isbn}")
    fun deleteBookById(@Path("isbn") isbn: Long): Call<DeleteBookResult>

    @PUT("/api/v1/books/{isbn}")
    fun updateBookById(@Path("isbn") isbn: Long,
                       @Body book: Book): Call<UpdateBookResult>
}