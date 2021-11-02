package com.example.pushkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
private const val MY_LOG_TAG = "MyLog"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(MY_LOG_TAG, "Сижу за решеткой в темнице сырой.\n Вскормленный в неволе орел молодой,")
    }
    override fun onStart() {
        super.onStart()

        Log.d(MY_LOG_TAG, "Мой грустный товарищ, махая крылом,\n Кровавую пищу клюет под окном,")
    }
    override fun onResume() {
        super.onResume()

        Log.d(MY_LOG_TAG, "Клюет, и бросает, и смотрит в окно,\n Как будто со мною задумал одно.")
    }

    override fun onPause() {
        super.onPause()

        Log.d(MY_LOG_TAG, "Зовет меня взглядом и криком своим\n И вымолвить хочет: «Давай улетим!")
    }

    override fun onStop() {
        super.onStop()

        Log.d(MY_LOG_TAG, "Мы вольные птицы; пора, брат, пора! \n Туда, где за тучей белеет гора,")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d(MY_LOG_TAG, "Туда, где синеют морские края,\n Туда, где гуляем лишь ветер… да я!…»")
    }


}