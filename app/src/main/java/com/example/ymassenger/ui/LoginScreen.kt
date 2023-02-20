package com.example.ymassenger.ui

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LoginScreen(onNextScreenClick: () -> Unit, onSignUpClick:() -> Unit ){
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = email.value, onValueChange = {email.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = password.value, onValueChange = {password.value = it})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onSignUpClick() }) {
            Text(text = "Войти")
        }
        Spacer(modifier = Modifier.height(4.dp))
        ClickableText(text = AnnotatedString("Зарегистрироваться"), onClick = {onNextScreenClick()})


        Spacer(modifier = Modifier.weight(2f))
    }
}


