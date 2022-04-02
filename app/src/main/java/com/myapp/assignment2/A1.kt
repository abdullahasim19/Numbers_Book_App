package com.myapp.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class A1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a1)

        var Icons=ArrayList<Int>()
        Icons.add(R.drawable.mario)

        var gview=findViewById<GridView>(R.id.g1)

        var l:CustomerAdapter=CustomerAdapter(Icons,this)

        gview.adapter=l


        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            var i= Intent(this,A2::class.java)
            startActivity(i)
            finish()

        }
    }
}