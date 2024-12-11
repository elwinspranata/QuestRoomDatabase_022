package com.example.pertemuan9.data.Data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan9.data.Data.entity.Mahasiswa

@Dao
interface Mahasiswadao {

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}