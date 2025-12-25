package com.example.questapi_202.repositori

import com.example.questapi_202.apiservice.ServiceApiSiswa
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// 1. Interface Container untuk Dependency Injection
interface ContainerApp {
    val repositoryDataSiswa: RepositoryDataSiswa
}

// 2. Implementasi Default Container
class DefaultContainerApp : ContainerApp {

    private val baseurl = "http://10.0.2.2/umyTI/"

    // Client HTTP dasar (Tanpa logging interceptor untuk saat ini agar tidak error)
    private val klien = OkHttpClient.Builder()
        .build()

    // Konfigurasi Retrofit
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseurl)
        // PERBAIKAN: Gunakan GsonConverterFactory (sesuai library yang sudah Anda install)
        .addConverterFactory(GsonConverterFactory.create())
        .client(klien)
        .build()

    // Inisialisasi Service API secara Lazy
    private val retrofitService: ServiceApiSiswa by lazy {
        retrofit.create(ServiceApiSiswa::class.java)
    }

    // Implementasi Repository yang akan digunakan di ViewModel
    override val repositoryDataSiswa: RepositoryDataSiswa by lazy {
        JaringanRepositoryDataSiswa(retrofitService)
    }
}

// 3. Class Application untuk inisialisasi Container di tingkat aplikasi
class AplikasiDataSiswa : android.app.Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        // Inisialisasi container saat aplikasi dijalankan
        this.container = DefaultContainerApp()
    }
}
