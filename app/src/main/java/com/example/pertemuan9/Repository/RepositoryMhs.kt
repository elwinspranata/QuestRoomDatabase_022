package com.example.pertemuan9.Repository

import com.example.pertemuan9.data.Data.entity.Mahasiswa

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)

}