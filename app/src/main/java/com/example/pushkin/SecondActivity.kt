package com.example.pushkin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

private const val KEY = "Hello_Key"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val hello: String? = intent.extras?.getString(KEY)
        val studyButton: Button = findViewById(R.id.study_button)

        Toast.makeText(this, hello, Toast.LENGTH_LONG).show()

        val link = Uri.parse("https://odin.study")
        val intent = Intent(Intent.ACTION_VIEW, link)

        studyButton.setOnClickListener {
            startActivity(intent)
        }

        val plusButton: Button = findViewById(R.id.plus_button)
        val intentP = Intent(Intent.ACTION_GET_CONTENT)
        intentP.type = "file/*"

        val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK)
                result.data?.data.toString()
            else
                Toast.makeText(this, "Ничего не выбрано", Toast.LENGTH_LONG).show()
        }
        plusButton.setOnClickListener {
            resultLauncher.launch(intentP)
        }

    }
}