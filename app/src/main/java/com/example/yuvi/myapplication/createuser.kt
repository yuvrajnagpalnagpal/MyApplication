package com.example.yuvi.myapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_createuser.*
import java.util.*

class createuser : AppCompatActivity() {

    var useravatar="profiledefault"
    var avatarcolor="[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createuser)
    }

    fun generateavatar(view: View)
    {
      val random=Random()
        val avatar=random.nextInt(28)
        val color=random.nextInt(2)

        if(color==0)
        {
            useravatar="light $avatar"
        }
        else{
            useravatar="dark $avatar"
        }

        val resorces=resources.getIdentifier(useravatar,"drawable",packageName)
        createavatarimage.setImageResource(resorces)

    }

    fun generatebackcolor(view: View)
    {

        val random=Random()
        val r=random.nextInt(255)
        val g=random.nextInt(255)
        val b=random.nextInt(255)

        createavatarimage.setBackgroundColor(Color.rgb(r,g,b))

        val savedr=r.toDouble()/255
        val savedg=g.toDouble()/255
        val savedb=b.toDouble()/255

        avatarcolor="[$savedr,$savedg,$savedb]"


    }

    fun createuserclicked(view: View)
    {

    }
}
