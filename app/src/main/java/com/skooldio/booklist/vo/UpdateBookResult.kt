package com.skooldio.booklist.vo

data class UpdateBookResult(
    var message: String,
    var status: String,
    var updatedBook: Book
)
