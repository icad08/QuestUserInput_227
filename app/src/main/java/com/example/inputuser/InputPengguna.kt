package com.example.inputuser

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TopAppBar

@composable

fun RegistrationScreen(){
    var namaLengkap by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    val jenisKelaminOptions = listOf("Laki-laki", "Perempuan")
    var statusPerkawinan by remember { mutableStateOf("") }
    val statusPerkawinanOptions = listOf("Janda", "Lajang", "Duda")
    var alamat by remember { mutableStateOf("") }

    val lightPurple = Color(0xFFF3EFFF)
    val mediumPurple = Color(0xFF673AB7)}

    Scaffold(
        topBar = {
    TopAppBar(
        title = {
            Text(
                text = "Formulir Pendaftaran",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        },
        backgroundColor = mediumPurple
    )
        },
    bottomBar = {
        Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
        color = Color.White,
        elevation = 8.dp
    )
        {
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(backgroundColor = mediumPurple)
            ) {
                Text("Submit", color = Color.White, fontSize = 16.sp)
            }
        }
    },
backgroundColor = lightPurple
)   {
    innerPadding ->
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(24.dp)
    ) {
        FormLabel(text = "NAMA LENGKAP")
        OutlinedTextField(
            value = namaLengkap,
            onValueChange = { namaLengkap = it },
            placeholder = { Text("Isian nama lengkap") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                focusedBorderColor = mediumPurple,
                unfocusedBorderColor = Color.LightGray
            ),
            shape = RoundedCornerShape(8.dp),
            singleLine = true
        )
        FormLabel(text = "JENIS KELAMIN")
        Column {
            jenisKelaminOptions.forEach { option ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (jenisKelamin == option),
                            onClick = { jenisKelamin = option }
                        )
                        .padding(vertical = 4.dp)
                ) {
                    RadioButton(
                        selected = (jenisKelamin == option),
                        onClick = { jenisKelamin = option },
                        colors = RadioButtonDefaults.colors(selectedColor = mediumPurple)
                    )
                    Text(
                        text = option,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        FormLabel(text = "ALAMAT")
        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            placeholder = { Text("Alamat") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                focusedBorderColor = mediumPurple,
                unfocusedBorderColor = Color.LightGray
            ),
            shape = RoundedCornerShape(8.dp),
            singleLine = true
        )
    }
}
}
@Composable
fun FormLabel(text: String) {
    Text(
        text = text,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Gray,
        modifier = Modifier.padding(bottom = 8.dp)
    )
}

@Preview(showBackground = true, device = "id:pixel_5")
@Composable
fun DefaultPreview() {
    FormulirPendaftaranTheme {
        RegistrationScreen()
    }
}