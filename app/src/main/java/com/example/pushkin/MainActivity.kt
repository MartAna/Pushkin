package com.example.pushkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


private const val MY_LOG_TAG = "MyLog"
private const val VALUE = "Value"

lateinit var requestInput: TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView

    private fun hello() {
        val helloVar = listOf("Hello!", "Hi!", "Привет!", "Доброго времени суток!")
        val helloValue = helloVar.random()
        helloTextView.text = helloValue
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestInput = findViewById(R.id.text_input_edit)
        helloTextView = findViewById(R.id.text_hello)


        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            hello()


        Log.d(MY_LOG_TAG, "Сижу за решеткой в темнице сырой.\n Вскормленный в неволе орел молодой,")



    }




    override fun onStart() {
        super.onStart()

        Log.d(MY_LOG_TAG,"Мой грустный товарищ, махая крылом,\n Кровавую пищу клюет под окном,")
    }

    override fun onResume() {
        super.onResume()

        Log.d(
            MY_LOG_TAG,
            "Клюет, и бросает, и смотрит в окно,\n Как будто со мною задумал одно."
        )
    }

    override fun onPause() {
        super.onPause()

        Log.d(
            MY_LOG_TAG,
            "Зовет меня взглядом и криком своим\n И вымолвить хочет: «Давай улетим!"
        )
    }

    override fun onStop() {
        super.onStop()

        Log.d(
            MY_LOG_TAG,
            "Мы вольные птицы; пора, брат, пора! \n Туда, где за тучей белеет гора,"
        )
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d(
            MY_LOG_TAG,
            "Туда, где синеют морские края,\n Туда, где гуляем лишь ветер… да я!…»"
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE, helloTextView.text.toString())

    }


}