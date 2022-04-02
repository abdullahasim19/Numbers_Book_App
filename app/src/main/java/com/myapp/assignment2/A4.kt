package com.myapp.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class A4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a4)

        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.ic_flag_of_belgium)
        Icons.add(R.drawable.lines)
        Icons.add(R.drawable.squirtle)
        Icons.add(R.drawable.ic_trophy)

        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l

        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            var i= Intent(this,A5::class.java)
            startActivity(i)
            finish()
        }
    }
}