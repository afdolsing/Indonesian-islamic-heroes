package com.meongdroid.aplikasipahlawanislamindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailHero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        supportActionBar?.title = "Biografi"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tHeroesName : TextView = findViewById(R.id.tv_item_name)
        val itemHero : ImageView = findViewById(R.id.image_item_photo)
        val tBiografi : TextView = findViewById(R.id.tv_biografi)

        val tHero = intent.getStringExtra(NAME)
        val heroUrl = intent.getStringExtra(PHOTO)
        val biography = intent.getStringExtra(BIOGRAPHY)

        tHeroesName.text = tHero
        Glide.with(this)
            .load(heroUrl)
            .apply(RequestOptions())
            .into(itemHero)
        tBiografi.text = biography



    }

    companion object {
        const val NAME = "name"
        const val PHOTO = "photo"
        const val BIOGRAPHY = "biography"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
