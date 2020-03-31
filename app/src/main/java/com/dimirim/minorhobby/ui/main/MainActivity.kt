package com.dimirim.minorhobby.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dimirim.minorhobby.R
import com.dimirim.minorhobby.ui.setting.SettingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var button:Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                applicationContext,
                SettingActivity::class.java
            )
            startActivity(intent)
        })
    }
}
