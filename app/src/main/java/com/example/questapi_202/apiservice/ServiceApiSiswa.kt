package com.example.questapi_202.apiservice

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Interface layanan API untuk mengelola data siswa.
 */
interface ServiceApiSiswa {

    /**
     * Mengambil data siswa dari API.
     * Endpoint: bacaTeman.php
     */
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    /**
     * Mengirim data siswa baru ke API.
     * Endpoint: insertTM.php
     */
    @POST("insertTM.php")
    suspend fun postSiswa(
        @Body dataSiswa: DataSiswa
    ): Response<Void>
}
