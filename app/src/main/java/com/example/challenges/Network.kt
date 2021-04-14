package com.example.challenges

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserNetwork {
    private val client = OkHttpClient.Builder().build()
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(UsersAPI::class.java)
    }
}
object AnimeNetwork {
    private val client = OkHttpClient.Builder().build()
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.jikan.moe")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(UsersAPI::class.java)
    }
}
