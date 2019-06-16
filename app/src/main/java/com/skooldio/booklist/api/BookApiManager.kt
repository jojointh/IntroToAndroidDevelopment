package com.skooldio.booklist.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BookApiManager {
    private var retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient())
        .baseUrl("http://www.example.com/")
        .build()

    fun get(): BookApiService =
        retrofit.create(BookApiService::class.java)
}
