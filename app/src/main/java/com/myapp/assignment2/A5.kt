package com.myapp.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class A5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a5)


        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.ic_flag_of_brazil)
        Icons.add(R.drawable.ic_flag_of_denmark)
        Icons.add(R.drawable.wolfeater)
        Icons.add(R.drawable.bulbasaur)
        Icons.add(R.drawable.charmander)


        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l

        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            var i= Intent(this,A6::class.java)
            startActivity(i)
            finish()
        }
    }
}