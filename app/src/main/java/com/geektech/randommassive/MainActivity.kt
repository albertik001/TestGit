package com.geektech.randommassive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.randommassive.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
            setArray()
        }
    }

    private fun setArray() {
        val randomValue = List<Int>(20) { Random.nextInt(0, 100) }
        var kol = 0
        var sum = 0
        for (i in 0..randomValue.size) {
            kol++
        }
        binding.tvReuslt.text = randomValue.toString()
        println(sum / kol)
        binding.tvResultPositive.text = (randomValue.sum() / kol).toString()
    }
}