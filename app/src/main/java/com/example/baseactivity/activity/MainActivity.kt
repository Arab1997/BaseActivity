package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baseactivity.R
import com.example.baseactivity.activity.BaseActivity
import com.example.baseactivity.activity.DetailsActivity
import com.example.myapplication.adapter.CustomMainAdapter
import com.example.myapplication.model.Member

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initViews() {
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun refreshAdapter(members: List<java.lang.reflect.Member>) {
        val adapter = CustomMainAdapter(this, members)
        recyclerView.adapter = adapter
    }


    fun openItemDetails(member: Member) {
       val intent  = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }



}
