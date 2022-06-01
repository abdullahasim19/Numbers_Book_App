package com.myapp.assignment2

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationManagerCompat

class A1 : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a1)
        UpdateNotification()

        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.mario)

        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l


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

        var i=Intent(this,A2::class.java)
        startActivity(i)
        finish()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun UpdateNotification()
    {
        val notification: Notification = Notification.Builder(this, "2")
            .setContentTitle("BOOKS APP")
            .setContentText("Current Page is 2")
            .setSmallIcon(R.drawable.ic_stat_add_alert)
            .build()

        var manger=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manger.notify(2,notification)
    }

}