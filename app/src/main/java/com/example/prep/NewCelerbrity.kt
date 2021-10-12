package com.example.prep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewCelerbrity : AppCompatActivity() {
//    lateinit var edname:EditText
//    lateinit var edtaboo1:EditText
//    lateinit var edtaboo2:EditText
//    lateinit var edtaboo3:EditText
//    lateinit var btnadd: Button
//
private lateinit var existingCelebrities: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_celerbrity)
   // existingCelebrities = intent.extras!!.getStringArrayList("celebrityNames")!!
    }
}