package com.example.questapi_202.repositori

/**
 * Interface ContainerApp berfungsi sebagai wadah untuk dependensi aplikasi.
 * Menyediakan akses abstrak ke repositori.
 */
interface ContainerApp {
    val repositoryDataSiswa: RepositoryDataSiswa
}

// ... (Interface ContainerApp)

import okhttp3.OkHttpClient

// 2. Implementasi Default Container
class DefaultContainerApp : ContainerApp {

    // Alamat IP Loopback Emulator Android (mengarah ke localhost komputer)
    private val baseurl = "http://10.0.2.2/umyTI/"

    // Client HTTP dasar
    private val klien = OkHttpClient.Builder()
        .build()

    // Properti lainnya akan ditambahkan pada commit berikutnya
    override val repositoryDataSiswa: RepositoryDataSiswa
        get() = TODO("Not yet implemented")
}

// ... (Interface ContainerApp)

import okhttp3.OkHttpClient

// 2. Implementasi Default Container
class DefaultContainerApp : ContainerApp {

    // Alamat IP Loopback Emulator Android (mengarah ke localhost komputer)
    private val baseurl = "http://10.0.2.2/umyTI/"

    // Client HTTP dasar
    private val klien = OkHttpClient.Builder()
        .build()

    // Properti lainnya akan ditambahkan pada commit berikutnya
    override val repositoryDataSiswa: RepositoryDataSiswa
        get() = TODO("Not yet implemented")
}
