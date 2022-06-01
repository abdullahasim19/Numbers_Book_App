package com.myapp.assignment2

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var p=PageReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startService(Intent(this,MusicService::class.java))

        startService(Intent(this,ForegroundService::class.java))



        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
           changePage()
        }


    }

    public fun changePage()
    {
        val intent = Intent()
        intent.action = "com.assignment4.CHANGE_INTENT"
        sendBroadcast(intent)

        var i=Intent(this,A1::class.java)
        startActivity(i)
    }

    override fun onStart() {
        super.onStart()

        var i =IntentFilter()
        i.addAction("com.assignment4.CHANGE_INTENT")
        registerReceiver(p,i)

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(p)
    }
}