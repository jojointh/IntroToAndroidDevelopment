package com.skooldio.booklist.vo

data class AddBookResult(
    var message: String,
    var status: String,
    var addedBook: Book
)