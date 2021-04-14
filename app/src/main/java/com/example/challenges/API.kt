package com.example.challenges

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersAPI : AnimeAPI {
    @GET("/users")
    fun getUsers(): Call<List<UserModel>>

}
interface AnimeAPI {
    @GET("/v3/top/anime")
    fun getTopAnimes(): Call<Anime>
}