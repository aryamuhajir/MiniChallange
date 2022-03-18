package com.binar.chapter3c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Screen4 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val btn5 : Button = findViewById(R.id.backto3)
        btn5.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.backto3 -> {
                var editUsia : EditText = findViewById(R.id.editUsia)
                var editAlamat : EditText = findViewById(R.id.editAlamat)
                var editPekerjaan : EditText = findViewById(R.id.editPekerjaan)


                var namaI = intent.getStringExtra("nama")
                var usiaI = editUsia.text.toString()
                var alamatI = editAlamat.text.toString()
                var pekerjaanI = editPekerjaan.text.toString()




                val intent = Intent(this, Screen3::class.java)
                intent.putExtra("nama", namaI)
                intent.putExtra("usia", usiaI)
                intent.putExtra("alamat", alamatI)
                intent.putExtra("pekerjaan", pekerjaanI)
                startActivity(intent)
            }
        }

    }
}