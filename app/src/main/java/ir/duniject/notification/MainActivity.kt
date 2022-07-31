package ir.duniject.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import ir.duniject.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnshow.setOnClickListener {
            val intent= Intent(this , MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this , 20 ,intent , 0)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(this , "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources , R.drawable.persenely))
                .setContentTitle("سلام دوست من")
                .setContentText(" بیا باهم برنامه نویسی کار کنیم ")
                .setContentIntent(pendingIntent)
                .build()



            notificationManager.notify((1..10).random() , notification)




        }
    }
}