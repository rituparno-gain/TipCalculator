package com.brewery.app.rigain.tipcalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val timer = object : Thread() {
            override fun run() = try {
                //Display for 3 seconds
                Thread.sleep(3000)
            } catch (e: InterruptedException) {
                startApp()
                e.printStackTrace()
            } finally {
                //Goes to MainActivity
                startApp()
            }
        }
        timer.start()
    }

    fun startApp(){
        val mainActivityIntent = Intent(this,MainActivity::class.java)
        startActivity(mainActivityIntent)
    }

}
