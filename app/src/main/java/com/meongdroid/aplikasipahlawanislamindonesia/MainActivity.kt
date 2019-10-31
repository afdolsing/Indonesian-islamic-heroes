package com.meongdroid.aplikasipahlawanislamindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed({
            changeActivity()
            finish()
        },3000)
    }

    private fun changeActivity(){
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }

}
