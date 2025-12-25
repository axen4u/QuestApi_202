package com.example.questapi_202.apiservice

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response
import retrofit2.http.GET // Tambah import ini
import retrofit2.http.Body // Tambah import ini
import retrofit2.http.POST // Tambah import ini
// ... imports sebelumnya
import retrofit2.http.Query // Tambah import ini

interface ServiceApiSiswa {
    // ... fungsi sebelumnya

    @GET("baca1Teman.php/{id}")
    suspend fun getSatuSiswa(@Query("id") id: Int): DataSiswa
}

interface ServiceApiSiswa {

    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa): Response<Void>
}


interface ServiceApiSiswa {

    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>
}
