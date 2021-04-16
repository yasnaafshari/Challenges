package com.example.challenges


import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import java.io.Serializable

data class UserModel(@SerializedName("login") override val first: String, override val type: String) : ModelParent
data class AnimeModel(@SerializedName("title") override val first: String, override val type: String): ModelParent
data class Anime(val top : List<AnimeModel>)
interface ModelParent {
    val type : String
    val first: String
}




