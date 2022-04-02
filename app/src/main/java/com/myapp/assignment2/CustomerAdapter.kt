package com.myapp.assignment2

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class CustomerAdapter(var img:ArrayList<Int>,var c:Context): BaseAdapter() {


    override fun getCount(): Int {
        return img.size
    }

    override fun getItem(position: Int): Any {
        return img[position]
    }

    override fun getItemId(position: Int): Long {
       return 1000

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      var layoutInflater:LayoutInflater= c!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

      var v:View=layoutInflater.inflate(R.layout.img,parent,false)

        var i=v.findViewById<ImageView>(R.id.img1)
        i.setImageResource(img[position])

        return v

    }
}