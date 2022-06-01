package com.myapp.assignment2

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.app.NotificationManager

import android.app.NotificationChannel

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class ForegroundService:Service() {
    val CHANNEL_ID="ForegroundServiceChannel"


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        createNotificationChannel()
        val notification: Notification = Notification.Builder(this, "2")
            .setContentTitle("BOOKS APP")
            .setContentText("Current Page is 1")
            .setSmallIcon(R.drawable.ic_stat_add_alert)
            .build()

        startForeground(2,notification)

        return START_NOT_STICKY

    }
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() {
        var channel= NotificationChannel("2","2", NotificationManager.IMPORTANCE_DEFAULT)
        var manager=getSystemService(AppCompatActivity.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
    }
}