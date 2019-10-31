package com.example.responsi180

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity_Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__login)

        val nama = findViewById<EditText>(R.id.etnama)
        val notelp = findViewById<EditText>(R.id.etnotelp)
        val user = findViewById<EditText>(R.id.etuser)
        val pass = findViewById<EditText>(R.id.etpass)
        val login = findViewById<Button>(R.id.btn)

        login.setOnClickListener {

            if (nama.text.isEmpty() || notelp.text.isEmpty() || user.text.isEmpty() || pass.text.isEmpty() ) {

                toast("Data Tidak Boleh Kosong ", Toast.LENGTH_LONG)
            }else {
                val name1 = nama.text.toString()
                val note1p1 = notelp.text.toString()
                val use11= user.text.toString()
                val pass1 = pass.text.toString()

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nama", name1)
                intent.putExtra("notelp", note1p1)
                intent.putExtra("username", use11)
                intent.putExtra("pswrd", pass1)
                startActivity(intent)
            }


        }

    }

    private fun toast(pesan: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan, length).show()

    }
}

