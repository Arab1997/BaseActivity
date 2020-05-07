package com.example.baseactivity.activity

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baseactivity.R
import com.example.myapplication.adapter.CustomDetailsAdapter
import com.example.myapplication.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initViews()

        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initViews() {
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomDetailsAdapter(members)
        recyclerView.adapter = adapter
    }



}
