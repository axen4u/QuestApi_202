package com.example.questapi_202.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questapi_202.modeldata.DataSiswa
// ... imports
import com.example.questapi_202.repositori.RepositoryDataSiswa
// ... imports
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
// ... imports
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

// ... (class body)

var listSiswa: StatusUiSiswa by mutableStateOf(StatusUiSiswa.Loading)
    private set

// Fungsi untuk memulai pengambilan data
fun loadSiswa() {
    viewModelScope.launch {
        // Set status ke Loading setiap kali fungsi dipanggil
        listSiswa = StatusUiSiswa.Loading

        // Logika try-catch akan ditambahkan di commit berikutnya
    }
}
}


// ... (interface StatusUiSiswa)

class HomeViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) : ViewModel() {

    // Properti state yang bisa berubah, default-nya Loading
    var listSiswa: StatusUiSiswa by mutableStateOf(StatusUiSiswa.Loading)
        private set
}


sealed interface StatusUiSiswa {
    // ... (kode interface tetap sama)
}

// Menambahkan parameter konstruktor
class HomeViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) : ViewModel() {

}


// Status UI untuk menentukan tampilan di layar
sealed interface StatusUiSiswa {
    data class Success(val siswa: List<DataSiswa>) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}

class HomeViewModel : ViewModel() {
    // ...
}
