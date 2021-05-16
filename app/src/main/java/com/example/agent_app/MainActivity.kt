package com.example.agent_app

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val settings = getSharedPreferences(
            "mysettings",
            Context.MODE_PRIVATE
        )
        val mail = settings.getString("email", "defaultvalue")
        Toast.makeText(this, mail, Toast.LENGTH_SHORT).show()
    }
}