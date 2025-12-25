package com.example.questapi_202.uicontroller

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questapi_202.uicontroller.route.DestinasiEntry
import com.example.questapi_202.uicontroller.route.DestinasiHome
import com.example.questapi_202.uicontroller.view.EntrySiswaScreen
import com.example.questapi_202.uicontroller.view.HomeScreenUtama // Pastikan nama ini sesuai dengan di file HomeScreen.kt

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController()) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        HostNavigasi(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

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
        // Halaman Home
        composable(DestinasiHome.route) {
            HomeScreenUtama(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick = {
                    // Nanti diisi saat fitur Detail sudah dibuat
                }
            )
        }

        // Halaman Entry
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) { inclusive = true }
                    }
                }
            )
        }

        // Halaman Detail & Edit (Belum dibuat, jangan dipanggil dulu)
    }
}
