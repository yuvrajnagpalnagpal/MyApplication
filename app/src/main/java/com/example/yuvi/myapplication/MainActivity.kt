package com.example.yuvi.myapplication

import android.content.Intent

import android.os.Bundle
import android.view.View

class MainActivity : base_activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toleague(view: View)
    {
          val leagueactivity=Intent(this,league::class.java)
            startActivity(leagueactivity)

    }

}
