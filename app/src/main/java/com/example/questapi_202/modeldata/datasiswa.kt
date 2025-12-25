package com.example.questapi_202.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id: Int,
    val nama: String,
    val alamat: String,
    val telpon: String
)


data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)

// ... (DataSiswa)

data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

// ... (DetailSiswa)

// ... (kode class sebelumnya)

fun DetailSiswa.toDataSiswa(): DataSiswa = DataSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)
// ... (kode sebelumnya)

fun DataSiswa.toUIStateSiswa(isEntryValid: Boolean = false): UIStateSiswa = UIStateSiswa(
    detailSiswa = this.toDetailSiswa(),
    isEntryValid = isEntryValid
)

fun DataSiswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)


