package com.example.questapi_202.uicontroller

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController()) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        // HostNavigasi akan dipanggil di sini nanti
        HostNavigasi(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

// Fungsi placeholder untuk HostNavigasi
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    // NavHost akan ditambahkan di commit berikutnya
}
// ... imports
import androidx.navigation.compose.NavHost
import com.example.questapi_202.uicontroller.route.DestinasiHome

// ... (DataSiswaApp tetap sama)

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        // Rute-rute (composable) akan ditambahkan bertahap
    }
}
// ... imports
import androidx.navigation.compose.composable
import com.example.questapi_202.uicontroller.view.HomeScreenUtama

// ... (DataSiswaApp tetap sama)

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        // Rute Halaman Home
        composable(DestinasiHome.route) {
            HomeScreenUtama(
                navigateToItemEntry = { /* TODO: Implement navigation */ },
                onDetailClick = { /* TODO: Implement detail click */ }
            )
        }
    }
}
// ... imports
import com.example.questapi_202.uicontroller.route.DestinasiEntry
import com.example.questapi_202.uicontroller.view.EntrySiswaScreen

// ... (bagian atas tetap sama)

NavHost(...) {
    // ... (composable Home tetap ada)

    // Rute Halaman Entry
    composable(DestinasiEntry.route) {
        EntrySiswaScreen(
            navigateBack = { /* TODO: Implement back navigation */ }
        )
    }
}
}
// ... (imports)

// ... (bagian atas tetap sama)

composable(DestinasiHome.route) {            HomeScreenUtama(
    // PERUBAHAN: Menambahkan aksi navigasi
    navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
    onDetailClick = { /* TODO */ }
)
}

// ... (imports)

composable(DestinasiEntry.route) {
    EntrySiswaScreen(
        navigateBack = {
            navController.navigate(DestinasiHome.route) {// PERUBAHAN: Membersihkan stack agar tombol back Android bekerja normal
                popUpTo(DestinasiHome.route) { inclusive = true }
            }
        }
    )
}

