package com.skooldio.booklist.vo

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "book_list")
data class Book(
    @PrimaryKey
    @ColumnInfo(name = "isbn")
    var isbn: String?,

    @ColumnInfo(name = "title")
    var title: String?,

    @ColumnInfo(name = "author")
    var author: String?,

    @ColumnInfo(name = "pages")
    var pages: Int
) : Parcelable
