package com.example.questapi_202.apiservice

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {

    /**
     * Mengambil daftar semua siswa dari server.
     * Endpoint: bacaTeman.php
     * @return List dari objek DataSiswa
     */
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    /**
     * Mengirim data siswa baru ke server untuk disimpan.
     * Endpoint: insertTM.php
     * @param dataSiswa Objek siswa yang akan dikirim
     */
    @POST("insertTM.php")
    suspend fun postSiswa(
        @Body dataSiswa: DataSiswa
    ): Response<Void>
}
