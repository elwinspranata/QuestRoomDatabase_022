package com.example.pertemuan9.Repository

import com.example.pertemuan9.data.Data.dao.Mahasiswadao
import com.example.pertemuan9.data.Data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswadao: Mahasiswadao
) : RepositoryMhs {

        override suspend fun insertMhs(mahasiswa: Mahasiswa)  {
            mahasiswadao.insertMahasiswa(mahasiswa)
        }
    }

