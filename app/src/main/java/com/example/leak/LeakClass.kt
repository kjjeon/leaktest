package com.example.leak

import android.util.Log

class LeakClass(listener: LeakListener) {

    init {
        Log.d("JOEL", "ohNO! ")
        leak = listener
    }

    companion object {
        lateinit var leak: LeakListener
    }
}