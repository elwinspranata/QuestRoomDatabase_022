package com.example.pertemuan9

import android.app.Application
import com.example.pertemuan9.dependenciesinjection.ContainerApp
import com.example.pertemuan9.dependenciesinjection.ContainerAppImpl

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Untuk menyimpan instance

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerAppImpl(this) // Menggunakan implementasi dari ContainerApp
    }
}