package com.example.praktikum3_state_235150201111049anazahra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color
import com.example.praktikum3_state_235150201111049anazahra.ui.theme.Praktikum3_State_235150201111049AnaZahraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilCard()
//            CounterApp()
//            ColorBoxApp()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Praktikum3_State_235150201111049AnaZahraTheme {
        Greeting("Android")
    }
}

@Composable
fun CounterApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Count: $count", fontSize = 30.sp)

        Row {
            Button(onClick = { if (count > 0) count-- }, modifier = Modifier.padding(8.dp)) {
                Text("–")
            }
            Button(onClick = { count++ }, modifier = Modifier.padding(8.dp)) {
                Text("+")
            }
        }
    }
}

//@Composable
//fun CounterApp(){
//    var count by remember { mutableStateOf(0)}
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ){
//        Text("Jumlah Klik: $count")
//        Spacer(modifier = Modifier.height(8.dp))
//        Button(onClick = { count++ }){
//            Text("Tambah")
//        }
//    }
//}

@Composable
fun FollowButton(
    isFollowed: Boolean,
    onClick: () ->Unit
){
    Button(onClick = onClick) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}

@Composable
fun FollowApp(){
    var isFollowed by remember { mutableStateOf(false)}
    FollowButton(
        isFollowed = isFollowed,
        onClick = {isFollowed = !isFollowed}
    )
}

//@Composable
//fun ProfilCard (){
//    var isFollowed by remember { mutableStateOf(false)}
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ){
//        Image(
//            painter = painterResource(R.drawable.profil),
//            contentDescription = "Foto Profil",
//            modifier = Modifier
//                .size(120.dp)
//                .clip(CircleShape)
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Text("Nama: Zahra", fontSize = 20.sp, fontWeight = FontWeight.Bold)
//        Spacer(modifier = Modifier.height(4.dp))
//        Text("Mahasiswa Teknik Informatika")
//        Spacer(modifier = Modifier.height(12.dp))
//        Button(onClick = { isFollowed = !isFollowed}){
//            Text(if (isFollowed) "Unfollow" else "Follow")
//        }
//    }
//}

@Composable
fun ColorBoxApp() {
    var isRed by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(if (isRed) Color.Red else Color.Green)
            .clickable { isRed = !isRed },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (isRed) "Merah" else "Hijau",
            color = Color.White)
    }
}

@Composable
fun ProfilCard() {
    var isFollowed by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier.size(100.dp)
        )
        Text("Zahra", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Mahasiswa & Mobile Developer Enthusiast", fontSize = 14.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { isFollowed = !isFollowed }) {
            Text(if (isFollowed) "Unfollow" else "Follow")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            if (isFollowed) "Anda mengikuti akun ini"
            else "Anda belum mengikuti akun ini"
        )
    }
}
