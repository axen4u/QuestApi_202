package com.example.questapi_202.repositori

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response // Tambahkan import ini

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}
