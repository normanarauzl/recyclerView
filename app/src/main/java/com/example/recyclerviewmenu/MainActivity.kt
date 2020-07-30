package com.example.recyclerviewmenu

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.*


class MainActivity : Activity() {

    lateinit var dataList: RecyclerView
    lateinit var titles: ArrayList<String>
    lateinit var images: ArrayList<Int>
    lateinit var adapter: Adapter

    override fun onStart() {
        super.onStart()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titles = ArrayList<String>()
        images = ArrayList<Int>()
        val appContext = this.applicationContext

        dataList = findViewById(R.id.dataList)

        titles.add("First Item")
        titles.add("Second Item")
        titles.add("Third Item")
        titles.add("Fourth Item")
        titles.add("Fifth Item")
        titles.add("Sixth Item")
        titles.add("Eight Item")
        titles.add("Nineh Item")

        images.add(R.drawable.ic_android_black_24dp)
        images.add(R.drawable.ic_audiotrack_black_24dp)
        images.add(R.drawable.ic_child_friendly_black_24dp)
        images.add(R.drawable.ic_android_black_24dp)
        images.add(R.drawable.ic_audiotrack_black_24dp)
        images.add(R.drawable.ic_child_friendly_black_24dp)
        images.add(R.drawable.ic_android_black_24dp)
        images.add(R.drawable.ic_audiotrack_black_24dp)

        adapter = Adapter(appContext, titles, images)

        val gridLayoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        dataList.setLayoutManager(gridLayoutManager)
        dataList.setAdapter(adapter)

    }
}
