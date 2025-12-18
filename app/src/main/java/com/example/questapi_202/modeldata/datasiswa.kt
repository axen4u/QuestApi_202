package com.example.questapi_202.modeldata

// Hapus import kotlinx.serialization.Serializable jika menggunakan Gson
// import kotlinx.serialization.Serializable

// Hapus anotasi @Serializable jika menggunakan Gson
data class DataSiswa(
    val id : Int,
    val nama : String,
    val alamat : String,
    val telpon : String
)


data class DetailSiswa(    val id: Int = 0,
                           val nama: String = "",
                           val alamat: String = "",
                           val telpon: String = ""
)


data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)// ... (kode DetailSiswa)
