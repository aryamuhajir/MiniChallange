package com.binar.chapter3c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Screen3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        var namaI = intent.getStringExtra("nama")
        var usiaI = intent.getStringExtra("usia")
        var alamatI = intent.getStringExtra("alamat")
        var pekerjaanI = intent.getStringExtra("pekerjaan")

        var txtNama : TextView = findViewById(R.id.txtNama)
        var txtUsia : TextView = findViewById(R.id.txtUsia)
        var txtAlamat : TextView = findViewById(R.id.txtAlamat)
        var txtPekerjaan : TextView = findViewById(R.id.txtPekerjaan)

        txtNama.text = namaI
        if (usiaI.equals("0") == false){


            txtUsia.visibility = View.VISIBLE
            txtAlamat.visibility = View.VISIBLE
            txtPekerjaan.visibility = View.VISIBLE

            txtUsia.text = usiaI
            txtAlamat.text = alamatI
            txtPekerjaan.text = pekerjaanI
        }else{

        }

        val btn4 : Button = findViewById(R.id.goto4)
        btn4.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.goto4 -> {
                var namaI = intent.getStringExtra("nama")
                val intent = Intent(this, Screen4::class.java)
                intent.putExtra("nama", namaI)
                startActivity(intent)
            }
        }

    }
}