package com.example.questapi_202.repositori

import com.example.questapi_202.modeldata.DataSiswa

interface RepositoryDataSiswa {
    // Fungsi CRUD akan ditambahkan bertahap
}
// ... imports

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
}