package com.example.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service : UsersAPI = UserNetwork.retrofit
        service.getUsers().enqueue(object : Callback,
            retrofit2.Callback<List<UserModel>> {
            override fun onResponse(
                call: Call<List<UserModel>>,
                response: Response<List<UserModel>>
            ) {
                var list : List<UserModel>? = response.body()
            }

            override fun onFailure(call: Call<List<UserModel>>, t: Throwable) {
            }

        })


    }


}
