package com.example.questapi_202.apiservice

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.http.GET

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
}
