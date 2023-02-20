package com.example.ymassenger.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegScreen( onNextScreenClick: () -> Unit){
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("")}
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = email.value, onValueChange = {email.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = password.value, onValueChange = {password.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onNextScreenClick() }) {
            Text(text = "Зарегистрироваться")
        }
        Spacer(modifier = Modifier.weight(2f))
    }
}