package com.example.challenges


import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import java.io.Serializable

data class UserModel(@SerializedName("login") val name: String, val type: String) : Serializable
data class AnimeModel(val title: String, val type: String)
data class Anime(val top : List<AnimeModel>)




