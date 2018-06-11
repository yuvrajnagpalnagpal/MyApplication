package com.example.yuvi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.util.Log

 open class base_activity : AppCompatActivity() {
    val tag = "lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "${javaClass} Oncreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        Log.d(tag,"${javaClass} Onstart")
        super.onStart()

    }
    override fun onResume()
    {
        Log.d(tag,"${javaClass} Onresume")
        super.onResume()


    }

    override fun onRestart() {
        Log.d(tag, "${javaClass} Onrestart" )
        super.onRestart()
    }
    override fun onPause() {
        Log.d(tag,"${javaClass} Onpause")
        super.onPause()

    }

    override fun onStop() {
        Log.d(tag,"${javaClass} Onstop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag,"${javaClass} Ondestroy")
        super.onDestroy()
    }
}
