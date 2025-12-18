package com.example.questapi_202.repositori

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response

/** * Interface repositori untuk memisahkan logika bisnis dari sumber data.
 */
interface RepositoryDataSiswa {

    // Fungsi untuk mengambil data (Read)
    suspend fun getDataSiswa(): List<DataSiswa>

    // Fungsi untuk menambah data (Create)
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}
