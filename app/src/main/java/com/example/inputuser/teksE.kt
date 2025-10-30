package com.example.inputuser

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
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

    Column ( modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width = 250.dp),
            label = { Text(text = "Nama Lengkap")},
            onValueChange = {
                textNama = it
            }
        )


    }

 }

}