package com.skooldio.booklist.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Books(
    var books: List<Book>
) : Parcelable