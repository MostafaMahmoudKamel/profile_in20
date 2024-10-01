package com.example.task_20_profiledesign_instant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task_20_profiledesign_instant.ui.component.DoubleText
import com.example.task_20_profiledesign_instant.ui.component.FourText
import com.example.task_20_profiledesign_instant.ui.component.TripleImage
import com.example.task_20_profiledesign_instant.ui.theme.Task_20_ProfileDesign_InstantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Task_20_ProfileDesign_InstantTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize()
            .padding(6.dp)
            .background(Color.White)
            .border(2.dp, Color.Gray, shape = RectangleShape)

    ) {


        Row(
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
                .height(120.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "profile",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Black, shape = CircleShape)
            )
            DoubleText("120", "Posts")
            DoubleText("120", "Followers")
            DoubleText("120", "Following")

        }

        Column {
            FourText()
        }

        Button(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray),
            onClick = {}) {
            Text("Edit Profile", color = Color.Black)
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )

        TripleImage()
        TripleImage()
        TripleImage()

    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileScreen()

}