package com.example.phonepepaymentgateway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.phonepe.intent.sdk.api.PhonePe

class MainActivity : AppCompatActivity() {
    var string_signature: String? =  ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        string_signature = PhonePe.getPackageSignature()
        val btn_pay= findViewById<Button>(R.id.btn_pay)

        btn_pay.setOnClickListener {
         Toast.makeText(this, "Button is clicked!", Toast.LENGTH_SHORT).show()
        }




    }
}