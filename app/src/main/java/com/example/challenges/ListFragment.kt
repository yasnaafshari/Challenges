package com.example.challenges

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class ListFragment(var position: Int) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_list, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        if (recyclerView != null) {
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
        if (position == 0) {
            val service: UsersAPI = UserNetwork.retrofit
            service.getUsers().enqueue(object : Callback,
                retrofit2.Callback<List<UserModel>> {
                override fun onResponse(
                    call: Call<List<UserModel>>,
                    response: Response<List<UserModel>>
                ) {
                    var list: List<UserModel>? = response.body()
                    if (recyclerView != null) {
                        recyclerView.adapter = list?.let { ListAdapter(it) }
                    }
                }

                override fun onFailure(call: Call<List<UserModel>>, t: Throwable) {
                }

            })
        } else {
            val service: AnimeAPI = AnimeNetwork.retrofit
            service.getTopAnimes().enqueue(object : Callback, retrofit2.Callback<Anime> {
                override fun onResponse(call: Call<Anime>, response: Response<Anime>) {
                    var anime: Anime? = response.body()
                    var list: List<AnimeModel>? = anime?.top
                    recyclerView.adapter = list?.let { AnimeAdapter(it) }
                }

                override fun onFailure(call: Call<Anime>, t: Throwable) {

                }

            })
        }

    }

}