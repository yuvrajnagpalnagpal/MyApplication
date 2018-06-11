package com.example.yuvi.myapplication
import android.content.Intent

import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skillactivity.*
import java.security.spec.MGF1ParameterSpec

class skillactivity : base_activity() {
    var player1=player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.getParcelableExtra<Parcelable>(extraplayer)
        setContentView(R.layout.activity_skillactivity)
    }

    fun onbigenner(view: View) {
        toggleButton7.isChecked = false
        player1.skill = "beginner"
    }

    fun onballer(view: View) {
        toggleButton6.isChecked = false
        player1.skill = "baller"
    }

   fun tofinish(view: View)
   {
       if( player1.skill!=="")
       {
           val finish= Intent(this,finish_activity::class.java)
           finish.putExtra(extraplayer,player1)
           startActivity(finish)
       }
       else{
           Toast.makeText(this,"select level",Toast.LENGTH_SHORT).show()
       }
   }
}

