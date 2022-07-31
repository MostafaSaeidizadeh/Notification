package ir.duniject.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import ir.duniject.notification.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bin1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 20, intent, 0)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.persenely))
                .setContentTitle("سلام دوست من")
                .setContentText(" بیا باهم در طبیعت برنامه نویسی کار کنیم ")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.BigPictureStyle()
                        .bigPicture(BitmapFactory.decodeResource(resources, R.drawable.oliveoil))
                )
                .build()

            notificationManager.notify((1..10).random(), notification)
        }
        binding.btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 20, intent, 0)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.persenely))
                .setContentTitle("سلام دوست من")
                .setContentText(" توضیحات ")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.BigTextStyle()
                        .bigText(
                            "خواص روغن زیتون برای سلامت بدن\n" +
                                    "روغن زیتون برای سلامت قلب، پوست، مو و رگ\u200Cهای شما خیلی مفید است. اگر در قسمتی از بدنتان خون لخته شده است، آن را با روغن زیتون ماساژ دهید تا به زودی بهبود یابد.\n" +
                                    "همچنین، روغن زیتون مملو از پلی\u200Cفنل\u200Cهای محافظ قلب است که کلسترول را پایین می\u200Cآورند. این روغن ضد التهاب است و اسیدهای چرب تک اشباع نشده\u200Cای دارد که بی\u200Cضررند و سوخت و ساز بدن را افزایش می\u200Cدهند.\n" +
                                    "در نتیجه، مصرف روغن زیتون باعث کاهش وزن می\u200Cشود. روغن زیتون اسیدهای چرب امگا-3 دارد. کلسترول\u200Cهای را افزایش می دهد و برای هضم غذا و متعادل نگه داشتن هورمون\u200Cها نیز مناسب است\n" )
                )
                .build()
            notificationManager.notify((1..10).random(), notification)
        }
        binding.btn3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 20, intent, 0)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK.or(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val notification = NotificationCompat.Builder(this, "myNotif")
                .setSmallIcon(android.R.drawable.stat_notify_chat)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.persenely))
                .setContentTitle("سلام دوست من")
                .setContentText(" معرفی محصولات  ")
                .setContentIntent(pendingIntent)
                .setStyle(
                    NotificationCompat.InboxStyle()
                        .addLine(" بازار من ")
                        .addLine("خوش امدید")
                        .addLine("روغن زیتون")
                        .addLine("محصولی داریم عالی ")
                        .addLine("لطفا دیدن فرمایید")
                        .addLine("با تشکر ")
                )
                .build()
            notificationManager.notify((1..10).random(), notification)
        }
    }
}