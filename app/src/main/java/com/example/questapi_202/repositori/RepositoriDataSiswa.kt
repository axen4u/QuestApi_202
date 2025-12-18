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



    /**
     * Implementasi repositori yang menggunakan layanan jaringan (Retrofit).
     */
    class JaringanRepositoryDataSiswa(
        private val serviceApiSiswa: ServiceApiSiswa
    ) : RepositoryDataSiswa {

        // Implementasi metode akan ditambahkan di commit berikutnya
        override suspend fun getDataSiswa(): List<DataSiswa> {
            TODO("Not yet implemented")
        }

        override suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> {
            TODO("Not yet implemented")
        }
    }

}
