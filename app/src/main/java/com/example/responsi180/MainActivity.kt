package com.example.responsi180

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent

        val user =  findViewById<EditText>(R.id.etus)
        val passwd =  findViewById<EditText>(R.id.etpaswd)

        val userr = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")
        val login = findViewById<Button>(R.id.etlogin)
        val register = findViewById<Button>(R.id.etregister)


        login.setOnClickListener{

            val  user= userr.text.toString()
            val  passwd= pass.text.toString()
            if(user == userr  && passwd == pass){
                val intent = Intent(this@MainActivity,Home::class.java)
                startActivity(intent)

            }
            else if (userr.text.isEmpty() || pass.text.isEmpty()){
                toast("Harap Registrasi",Toast.LENGTH_LONG)
            }else{

                toast("Username atau Password Anda Salah ", Toast.LENGTH_LONG)
            }
        }

        register.setOnClickListener{

            val intent = Intent(this@MainActivity,Activity_Login::class.java)
            startActivity(intent)
        }

    }
    private fun toast(pesan: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan, length).show()

    }

}
