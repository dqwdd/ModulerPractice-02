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

        // 모듈간의 상호참조는 안된다.
        // moduletest 모듈에서 build.gradle.kts 에서 지울게 좀 있다.
        // 이번엔 view 가 들어가서 남길 건 남겼는데 data 모듈로 쓴다던지 하는 상황에서는 더 지워도 된다.
        // 사용하는 app 의 build.gradle.kts 에서 dependencies 에서 project 를 추가해야 한다
        val ttt = findViewById<TextView>(R.id.tvTest)
        ttt.setOnClickListener {
            val myIntent = Intent(this, ModuleTestActivity::class.java)
            startActivity(myIntent)
        }
    }
}