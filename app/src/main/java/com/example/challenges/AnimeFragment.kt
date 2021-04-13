package com.example.challenges

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class AnimeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_anime, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerView = view?.findViewById<RecyclerView>(R.id.animeRecyclerView)
        if (recyclerView != null) {
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
        val service: AnimeAPI? = AnimeNetwork.retrofit
        service?.getTopAnimes()?.enqueue(object : Callback,
            retrofit2.Callback<List<AnimeModel>> {

            override fun onResponse(
                call: Call<List<AnimeModel>>,
                response: Response<List<AnimeModel>>
            ) {
                var list: List<AnimeModel>? = response.body()
                if (recyclerView != null) {
                    recyclerView.adapter = list?.let { AnimeAdapter(it) }
                }
            }

            override fun onFailure(call: Call<List<AnimeModel>>, t: Throwable) {

            }

        })
    }
}

