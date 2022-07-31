package ir.duniject.notification

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class MyApp() : Application() {
    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val notificationChannel =
                NotificationChannel("myNotif", "footbal", NotificationManager.IMPORTANCE_HIGH)

            notificationChannel.description = "this channel show notification about footbal"

            notificationManager.createNotificationChannel(notificationChannel)

        }

    }

}

