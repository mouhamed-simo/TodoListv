package com.example.todolist.splach

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todolist.R
import androidx.lifecycle.lifecycleScope
import com.example.todolist.explain
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplachActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splach)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Accueil)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        lifecycleScope.launch {
            delay(1500)
            startActivity(Intent(this@SplachActivity, explain::class.java))
            finish()
        }
}}