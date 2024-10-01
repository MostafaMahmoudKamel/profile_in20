package com.example.task_20_profiledesign_instant.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FourText(){
    Column(modifier = Modifier.padding(start=24.dp)) {
        Text(text="Mostafa", fontWeight = FontWeight.Bold, fontSize = 32.sp)
        Text(text="I like travelling", fontSize = 16.sp)
        Text(text="Android Developer", fontSize = 16.sp)
        Text(text="Sleeping", fontSize = 16.sp)
    }
}