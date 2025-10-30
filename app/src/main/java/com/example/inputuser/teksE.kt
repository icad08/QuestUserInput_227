package com.example.inputuser

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember {mutableStateOf(value= "") }
    var textAlamat by remember { mutableStateOf(value= "") }
    var textJK by remember { mutableStateOf(value= "") }

    var nama by remember { mutableStateOf(value = "")}
    var alamat by remember { mutableStateOf(value = "")}
    var jenis by remember { mutableStateOf(value = "")}

    val gender:list<String> =listOf("Laki-Laki","Perempuan")



}