package com.example.projectbp2655

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.buttonLog)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logObj = Login()

        //input
        logObj.username = txtUsername.text.toString()
        logObj.password = txtPassword.text.toString()

        //event saat button login
        btnLogin.setOnClickListener{
            if(logObj.loginCheck() == true) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else {
                Toast.makeText(this, "Login Gagal, silahkan cek Username dan Password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}