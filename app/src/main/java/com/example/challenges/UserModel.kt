package com.example.challenges


import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import java.io.Serializable

data class UserModel(@SerializedName("login") val name: String, val type: String) : Serializable


interface UsersAPI {
    @GET("/users")
    fun getUsers(): Call<List<UserModel>>

}



