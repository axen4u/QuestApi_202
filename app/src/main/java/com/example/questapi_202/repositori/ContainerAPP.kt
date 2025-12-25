package com.example.questapi_202.repositori

/**
 * Interface ContainerApp berfungsi sebagai wadah untuk dependensi aplikasi.
 * Menyediakan akses abstrak ke repositori.
 */
interface ContainerApp {
    val repositoryDataSiswa: RepositoryDataSiswa
}
