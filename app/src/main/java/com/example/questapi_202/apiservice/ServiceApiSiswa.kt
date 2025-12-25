package com.example.questapi_202.apiservice

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response
import retrofit2.http.GET // Tambah import ini

interface ServiceApiSiswa {

    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>
}
