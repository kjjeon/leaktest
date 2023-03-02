package com.example.leak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun leakTest(view: View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fcv_root, BlankFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }
}