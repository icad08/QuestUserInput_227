package com.example.inputuser

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
}
    )