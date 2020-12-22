package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        adapter = SampleAdapter(arrayListOf("aaa", "bbb", "ccc"), object : SampleAdapter.Callback {
            override fun onItemClicked(value: String) {

            }

        })

        rv_sample.layoutManager = LinearLayoutManager(this)
        rv_sample.adapter = adapter

    }
}