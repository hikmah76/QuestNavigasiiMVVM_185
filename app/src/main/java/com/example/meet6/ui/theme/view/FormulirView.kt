package com.example.meet6.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun FormulirView(modifier: Modifier = Modifier,
                 pilihanJK: List<String>,
                 onClickButton: (MutableList<String>) -> Unit,


                 ){

    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noHp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    var listdata : MutableList<String> = mutableListOf(nama, gender, alamat, noHp, email, nim)




    Column (modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)

        Spacer(modifier = Modifier.padding(20.dp))

        TextField (
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = {Text("Nama")},
            placeholder = {Text("Masukkan Nama Anda")}
        )

        TextField(
            value = nim,
            onValueChange = { nim = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = { Text("NIM") }, //menambahkan nim pada formulirView
            placeholder = { Text("Masukkan NIM Anda") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Row (
            modifier = Modifier.fillMaxWidth()) {
            pilihanJK.forEach(){ selectedGender ->
                Row (verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = gender == selectedGender,
                        onClick = {
                            gender = selectedGender
                        })
                }
                Text(text = selectedGender) }
        }

        TextField (
            value = email,
            onValueChange = {email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = {Text("Email")},
            placeholder = {Text("Masukkan Email Anda")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        TextField (
            value = noHp,
            onValueChange = {noHp = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = {Text("Nomor Handphone")},
            placeholder = {Text("Masukkan Nomor Handphone Anda")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField (
            value = alamat,
            onValueChange = {alamat = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            label = {Text("Alamat")},
            placeholder = {Text("Masukkan Alamat Anda")},
        )

        Button(onClick = {
            onClickButton(listdata)
        }, modifier = Modifier.padding(vertical = 10.dp)
        )

        {
            Text("Simpan")
        }



    }
}