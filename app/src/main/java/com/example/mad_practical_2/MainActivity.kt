package com.example.mad_practical_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sendMessage("onCreate function is called")
    }
    fun sendMessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        sendMessage("onPause function is called")
    }

    override fun onStart() {
        super.onStart()
        sendMessage("onStart function is called")
    }

    override fun onStop() {
        super.onStop()
        sendMessage("onStop function is called")
    }

    override fun onResume() {
        super.onResume()
        sendMessage("onResume function is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        sendMessage("onDestory function is called")
    }
}
