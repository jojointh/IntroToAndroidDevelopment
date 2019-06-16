package com.skooldio.booklist.vo

data class DeleteBookResult(
    var message: String,
    var status: String,
    var deletedBook: Book
)