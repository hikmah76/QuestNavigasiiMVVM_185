package com.example.meet6.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import com.example.meet6.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(Mahasiswa())
    val uiState: StateFlow<Mahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>) {
        _uiState.update { data ->
            data.copy(
                nama = ls[0],
                nim = ls[1],
                gender = ls[2],
                alamat = ls[3],
                email = ls[4],
                noHp = ls[5]
            )
        }
    }
}
