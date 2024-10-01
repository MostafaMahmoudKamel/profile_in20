package com.example.task_20_profiledesign_instant.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun DoubleText(text1:String,text2:String){
    Column(modifier = Modifier.padding(top=16.dp)) {
        Text(text="$text1", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
        Text(text="$text2")
    }
}