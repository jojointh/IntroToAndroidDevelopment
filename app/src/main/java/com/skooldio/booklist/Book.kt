package com.skooldio.booklist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book(
    var isbn: String?,
    var title: String?,
    var author: String?,
    var pages: Int
) : Parcelable
