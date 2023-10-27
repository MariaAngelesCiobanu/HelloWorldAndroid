package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityCalculadoraBinding

class Calculadora2_table_activity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}