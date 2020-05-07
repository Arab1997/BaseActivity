package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityEventSource
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baseactivity.R
import com.example.baseactivity.network.BaseServer
import com.example.myapplication.activity.MainActivity

import com.example.myapplication.model.Member

open class BaseAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() { //Paging  add method val listener: OnBottomReachedListener
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    protected fun getServer(): String {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else BaseServer.SERVER_DEVELOYMENT
    }

    protected fun isEmpty(s: String?): Boolean {
        return s == null || s.trim() {it <= ' '}.isEmpty()
    }

}





