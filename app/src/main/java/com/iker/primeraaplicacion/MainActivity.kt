package com.iker.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    var startTime: Long = 0
    var endTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","Aplicación creada")


    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","Aplicación iniciada")
        startTime = System.currentTimeMillis()
        println(startTime)
        #asd
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado","Resumiendo aplicación");
    }

    override fun onStop() {
        super.onStop()
        Log.d("Estado","Aplicación Ya no está visible")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado","Aplicación cerrada")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Estado","Aplicación en pausa")
        endTime = System.currentTimeMillis()
        val timeUsed: Long = (endTime-startTime)/1000
        println("El tiempo en el que se ha usado la aplicación es de $timeUsed segundos")



    }








}