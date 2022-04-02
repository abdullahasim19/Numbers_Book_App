package com.myapp.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class A8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a8)

        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.ic_flag_of_germany)
        Icons.add(R.drawable.squirtle)
        Icons.add(R.drawable.mario)
        Icons.add(R.drawable.lines)
        Icons.add(R.drawable.charmander)
        Icons.add(R.drawable.ic_trophy)
        Icons.add(R.drawable.wolf)
        Icons.add(R.drawable.wolfeater)


        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l

        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            var i= Intent(this,A9::class.java)
            startActivity(i)
            finish()
        }
    }
}