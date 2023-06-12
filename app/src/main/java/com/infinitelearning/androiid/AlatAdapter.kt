package com.infinitelearning.androiid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlatAdapter (private val context: Context, private val alat: List<Alat>, val listener: (Alat) -> Unit)
    : RecyclerView.Adapter<AlatAdapter.AlatViewHolder>(){

    class AlatViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgHero=view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHero=view.findViewById<TextView>(R.id.tv_item_name)
        val descHero=view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(hero: Alat, listener: (Alat) -> Unit){
            imgHero.setImageResource(hero.imgAlat)
            nameHero.text = hero.nameAlat
            descHero.text = hero.descAlat

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlatViewHolder {
        return AlatViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_alat, parent, false)
        )
    }


    override fun onBindViewHolder(holder: AlatViewHolder, position: Int) {
        holder.bindView(alat[position],listener)
    }

    override fun getItemCount(): Int = alat.size

}