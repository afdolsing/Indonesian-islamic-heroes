package com.meongdroid.aplikasipahlawanislamindonesia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHeroAdapter (private val listWeapon : ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWeapon.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val weapon = listWeapon[position]

        Glide.with(holder.itemView.context)
            .load(weapon.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = weapon.name
        holder.tvType.text = weapon.country

        val context = holder.itemView.context
        holder.itemView.setOnClickListener {
            val detail = Intent(context, DetailHero::class.java)
            detail.putExtra(DetailHero.NAME, weapon.name)
            detail.putExtra(DetailHero.PHOTO, weapon.photo)
            detail.putExtra(DetailHero.BIOGRAPHY, weapon.biography)
            context.startActivity(detail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvType: TextView = itemView.findViewById(R.id.tv_item_country)
        val imgPhoto: ImageView = itemView.findViewById(R.id.image_item_photo)
    }
}