package com.example.questapi_202.repositori

import com.example.questapi_202.modeldata.DataSiswa
import retrofit2.Response // Tambahkan import ini

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}
interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
    suspend fun getSatuSiswa(id: Int): DataSiswa
    suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): Response<Void>
    suspend fun hapusSatuSiswa(id: Int): Response<Void>
}
class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {

    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()

    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> =
        serviceApiSiswa.postSiswa(dataSiswa)

    // Sisa fungsi masih TODO...
    override suspend fun getSatuSiswa(id: Int): DataSiswa = TODO()
    override suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): Response<Void> = TODO()
    override suspend fun hapusSatuSiswa(id: Int): Response<Void> = TODO()
}
class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {
    // ... (fungsi sebelumnya)

    override suspend fun getSatuSiswa(id: Int): DataSiswa = serviceApiSiswa.getSatuSiswa(id)

    override suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): Response<Void> =
        serviceApiSiswa.editSatuSiswa(id, dataSiswa)

    // Hapus masih TODO
    override suspend fun hapusSatuSiswa(id: Int): Response<Void> = TODO()
}
