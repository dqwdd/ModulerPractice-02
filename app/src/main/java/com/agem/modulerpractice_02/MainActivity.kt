package com.agem.modulerpractice_02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.agem.moduletest.ModuleTestActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ttt = findViewById<TextView>(R.id.tvTest)
        ttt.setOnClickListener {
            val myIntent = Intent(this, ModuleTestActivity::class.java)
            startActivity(myIntent)
        }
    }
}