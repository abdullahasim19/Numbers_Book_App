package com.myapp.assignment2

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.annotation.RequiresApi

class A5 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a5)


        UpdateNotification()

        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.ic_flag_of_brazil)
        Icons.add(R.drawable.ic_flag_of_denmark)
        Icons.add(R.drawable.wolfeater)
        Icons.add(R.drawable.bulbasaur)
        Icons.add(R.drawable.charmander)


        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l

        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            val intent = Intent()
            intent.action = "com.assignment4.CHANGE_INTENT"
            sendBroadcast(intent)

            var i= Intent(this,A6::class.java)
            startActivity(i)
            finish()
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun UpdateNotification()
    {
        val notification: Notification = Notification.Builder(this, "2")
            .setContentTitle("BOOKS APP")
            .setContentText("Current Page is 5")
            .setSmallIcon(R.drawable.ic_stat_add_alert)
            .build()

        var manger=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manger.notify(2,notification)
    }
}