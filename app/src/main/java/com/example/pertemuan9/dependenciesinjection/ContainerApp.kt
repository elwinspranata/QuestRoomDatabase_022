package com.example.pertemuan9.dependenciesinjection

import android.content.Context
import com.example.pertemuan9.Repository.LocalRepositoryMhs
import com.example.pertemuan9.Repository.RepositoryMhs
import com.example.pertemuan9.data.database.KrsDatabase

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}


class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}
