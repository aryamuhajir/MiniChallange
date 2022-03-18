package com.binar.chapter3c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Screen2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btn2 : Button = findViewById(R.id.goto3)
        btn2.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.goto3 -> {
                var edtNama : EditText = findViewById(R.id.edtNama)
                var nama = edtNama.text.toString()
                val intent = Intent(this, Screen3::class.java)
                intent.putExtra("nama", nama)
                intent.putExtra("usia", "0")
                intent.putExtra("alamat", "0")
                intent.putExtra("pekerjaan", "0")
                startActivity(intent)
            }
        }
    }
}