package com.example.meet6.ui.theme.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import com.example.meet6.model.Mahasiswa



@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {



        TampilData(
            judul = "Nama",
            isinya = mhs.nama
        )
        TampilData(
            judul = "Nim",
            isinya = mhs.nim //menambahkan nim pada tampilMahasiswaView
        )
        TampilData(
            judul = "Jenis Kelamin",
            isinya = mhs.gender
        )
        TampilData(
            judul = "Alamat",
            isinya = mhs.alamat
        )
        TampilData(
            judul = "Email",
            isinya = mhs.email
        )
        TampilData(
            judul = "NoHp",
            isinya = mhs.noHp //menambahkan noHp pada tampilMahasiswaView
        )
    }
}

@Composable
fun TampilData(
    judul: String,
    isinya: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(judul, modifier = Modifier.weight(1f))
        Text(":", modifier = Modifier.weight(0.1f))
        Text(isinya, modifier = Modifier.weight(2f))
    }
}