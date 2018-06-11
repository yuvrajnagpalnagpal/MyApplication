package com.example.yuvi.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)
    }


    fun loginloginclicked(view: View)
    {

    }

    fun signbuttonclicked(view: View)
    {
     val createuserintent=Intent(this,createuser::class.java)
        startActivity(createuserintent)
    }

}
