package com.example.questapi_202.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questapi_202.modeldata.DataSiswa

// Status UI untuk menentukan tampilan di layar
sealed interface StatusUiSiswa {
    data class Success(val siswa: List<DataSiswa>) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}

class HomeViewModel : ViewModel() {
    // ...
}
