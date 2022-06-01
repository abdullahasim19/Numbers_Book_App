package com.myapp.assignment2

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService

class PageReceiver:BroadcastReceiver() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent!!.action=="com.assignment4.CHANGE_INTENT")
        {
            if (context != null) {
                ShowNotification("Book","Page has changed",context)
            }
        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun ShowNotification(title:String,text:String,c:Context)
    {
        var channel= NotificationChannel("1","1", NotificationManager.IMPORTANCE_DEFAULT)
        var manager=c.getSystemService(AppCompatActivity.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)

        var builder = Notification.Builder(c,"1",)
        builder.setSmallIcon(R.drawable.ic_stat_add_alert).setContentTitle(title).setContentText(text)

        var compact = NotificationManagerCompat.from(c)
        compact.notify(1,builder.build())

    }
}