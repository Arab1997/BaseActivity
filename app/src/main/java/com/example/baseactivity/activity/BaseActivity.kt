package com.example.baseactivity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baseactivity.R
import com.example.baseactivity.network.BaseServer
import com.example.myapplication.model.Member


open class BaseActivity : AppCompatActivity() {

    protected fun getServer(): String {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else BaseServer.SERVER_DEVELOYMENT
    }


    protected fun isEmpty(s: String?): Boolean {
        return s == null || s.trim() {it <= ' '}.isEmpty()
    }

    protected fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Makhmudov" + i, "Abdulloh" + i))
        }
        return members
    }

   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }*/
}
