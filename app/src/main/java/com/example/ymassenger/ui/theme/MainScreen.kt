package com.example.ymassenger.ui.theme

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {



        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp), backgroundColor = Color.LightGray
        ) {

            Row(horizontalArrangement = Arrangement.Center) {


            }

        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "ВолкВолкВолкВолкВолкВолк", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn() {
            items(6) {
                Chat()
            }
        }
    }
}

@Composable
fun Chat() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .height(120.dp)
            .clickable { },
        backgroundColor = Color.LightGray,
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
            Text(text = "Имя Фамилия", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 24.dp))
        }

    }
}