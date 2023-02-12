package com.example.ymassenger.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onNextScreenClick: () -> Unit){
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        TextField(value = email.value, onValueChange = {email.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = password.value, onValueChange = {password.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Войти")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "Нет аккаунта?")
        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = { onNextScreenClick() }) {
            Text(text = "Зарегистриваться")
        }
    }
}
