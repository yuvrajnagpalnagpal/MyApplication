package com.example.yuvi.myapplication

import android.content.Intent

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*


class league : base_activity( ) {

    var player1=player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(extraplayer,player1)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
        {
            player1=savedInstanceState.getParcelable(extraplayer)
        }
    }
    fun onmens(view: View)
    {
        womens.isChecked=false
        toggleButton3.isChecked=false
        player1.league="mens"
    }
    fun onwomens(view: View)
    {
        mens.isChecked=false
        toggleButton3.isChecked=false
        player1.league="womens"
    }
    fun coed(view: View)
    {
        mens.isChecked=false
        womens.isChecked=false
        player1.league="coed"
    }
     fun leaguenext(view: View)
     {
         if(player1.league!=="") {
             val skillactivity = Intent(this, skillactivity::class.java)
             skillactivity.putExtra(extraplayer,player1)
             startActivity(skillactivity)
         }
         else
         {
             Toast.makeText(this,"plz select legue",Toast.LENGTH_SHORT).show()
         }
     }


}
