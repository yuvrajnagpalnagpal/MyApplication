package com.example.yuvi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_finish_activity.*

class finish_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_activity)
        val player1=intent.getParcelableExtra<player>(extraplayer)

        findingleague.text="looking for league ${player1.league} ${player1.skill} near you"
    }
}
