package com.example.pertemuan9.dependenciesinjection

import android.content.Context
import com.example.pertemuan9.Repository.LocalRepositoryMhs
import com.example.pertemuan9.Repository.RepositoryMhs
import com.example.pertemuan9.data.database.KrsDatabase

interface ContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerAppImpl(private val context: Context) : ContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}