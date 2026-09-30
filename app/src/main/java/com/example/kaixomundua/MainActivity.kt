package com.example.kaixomundua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kaixomundua.ui.theme.KaixoMunduaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KaixoMunduaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Mikel",
                        surname = "UrlezagaAAAA",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, surname: String) {
    Surface(color = Color.Yellow){

        Column(modifier = modifier.padding(14.dp)
            .fillMaxSize()) {
            Text(
                text = "Kaixo $name $surname!",
                modifier = modifier.padding(24.dp)
            )

            Text(
                text="Holaaaa",
                color = Color.Red,
                fontSize = 20.sp
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KaixoMunduaTheme {
        Greeting("Mikel", surname = "UrlezagaAAAA")
    }
}