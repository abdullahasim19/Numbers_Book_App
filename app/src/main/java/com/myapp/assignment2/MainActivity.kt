package com.myapp.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.GridView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

//    var Icons=ArrayList<ArrayList<Int>>()
//
//
//    var currentIndex:Int=0
//
//    fun setIcons()
//    {
//
//        var i:Int=0
//        while(i<10)
//        {
//            Icons.add(ArrayList<Int>())
//            i++
//        }
//
//        Icons[0].add(R.drawable.mario)
//        Icons[1].add(R.drawable.ic_flag_of_argentina)
//        Icons[1].add(R.drawable.ic_flag_of_australia)
//        Icons[2].add(R.drawable.charmander)
//        Icons[2].add(R.drawable.wolf)
//        Icons[2].add(R.drawable.moon)
//        Icons[3].add(R.drawable.ic_flag_of_belgium)
//        Icons[3].add(R.drawable.lines)
//        Icons[3].add(R.drawable.squirtle)
//        Icons[3].add(R.drawable.ic_trophy)
//        Icons[4].add(R.drawable.ic_flag_of_brazil)
//        Icons[4].add(R.drawable.ic_flag_of_denmark)
//        Icons[4].add(R.drawable.wolfeater)
//        Icons[4].add(R.drawable.bulbasaur)
//
//    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        setIcons()
//
//        var gview=findViewById<GridView>(R.id.g1)
//
//
//
//        var l:CustomerAdapter=CustomerAdapter(Icons[0],this)
//
//        gview.adapter=l
//
        var b=findViewById<Button>(R.id.btn1)

        b.setOnClickListener {
            var i=Intent(this,A1::class.java)
            startActivity(i)
        }

    }
}