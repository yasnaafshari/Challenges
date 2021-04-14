package com.example.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        tabLayout.setupWithViewPager(viewPager)
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter


    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    private inner class ScreenSlidePagerAdapter(fm: FragmentManager) :
        FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int = 2

        override fun getItem(position: Int): Fragment = ListFragment(position)
        override fun getPageTitle(position: Int): CharSequence? {
            if (position == 0) {
                return "GitHub"
            } else return "Anime"
        }
    }


}
