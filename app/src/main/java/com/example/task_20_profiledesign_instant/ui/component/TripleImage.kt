package com.example.task_20_profiledesign_instant.ui.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage



@Composable
fun TripleImage() {
    Row(Modifier.padding(1.dp)) {
        AsyncImage(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnF5qiN1SPr4jhMhjtTYI71aWRVnVv6XnBHj36hfCxqLESV3mMeI6LMlcD8Q&s",
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(2.dp)
                .weight(1f)
                .height(150.dp)
                .background(
                    color = Color.White,
                    RectangleShape
                )
                .clip(RectangleShape)

        )
        AsyncImage(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9e-sqvS0CZSX72Q0NzGAZ5Q1t23CnFi6pGcnOI8-s6R35_mc_RODmVGGqag&s",
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .weight(1f)
                .padding(2.dp)
                .height(150.dp)
                .background(
                    color = Color.White,
                    RectangleShape
                )
                .clip(RectangleShape)

        )
        AsyncImage(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyi5LskJDpqvnR_hVr3gSlgSmNjcLqFDVACkNIIwEkwHgVHxQcCuQCYHHFrg&s",
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .weight(1f)
                .padding(2.dp)
                .height(150.dp)
                .background(
                    color = Color.White,
                    RectangleShape
                )
                .clip(RectangleShape)

        )



    }

}

