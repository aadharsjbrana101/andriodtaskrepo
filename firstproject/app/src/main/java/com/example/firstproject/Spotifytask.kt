package com.example.firstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class Spotifytask : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SpotifyHome()
        }
    }
}

@Composable
fun SpotifyHome() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(12.dp)
    ) {

        Text(
            text = "Recently played",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {

            MusicCircle(
                image = R.drawable.drake,
                name = "Drake"
            )

            MusicCircle(
                image = R.drawable.image33,
                name = "Travis Scott"
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Your 2021 in review",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            MusicBox(
                image = R.drawable.drake,
                title = "Your Top Songs 2026"
            )

            MusicBox(
                image = R.drawable.image33,
                title = "Your Artists Revealed"
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Editor's picks",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            MusicBox(
                image = R.drawable.ab67616d00001e02346d77e155d854735410ed18,
                title = "Kanye West"
            )

            MusicBox(
                image = R.drawable.ab67616d00001e0295184f6a953569b683ca9a0d,
                title = "Kanyewest , Travis Scott"
            )
        }
    }
}

@Composable
fun MusicCircle(
    image: Int,
    name: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = name,
            color = Color.White,
            fontSize = 11.sp
        )
    }
}

@Composable
fun MusicBox(
    image: Int,
    title: String
) {

    Column(
        modifier = Modifier.width(140.dp)
    ) {

        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(140.dp)
                .clip(RoundedCornerShape(2.dp)),
            contentScale = ContentScale.Crop
        )

        Text(
            text = title,
            color = Color.White,
            fontSize = 11.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SpotifyPreview() {
    SpotifyHome()
}