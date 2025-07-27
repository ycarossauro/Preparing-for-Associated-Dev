package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emptyactivity.ui.theme.HappyBirthdayActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayActivityTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HappyBirthdayInput(recipient = "Laura",
                        sender = "Ycaro",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun HappyBirthdayInput(recipient: String, sender: String,  modifier: Modifier = Modifier){

        Column (modifier = modifier,
            verticalArrangement = Arrangement.Center) {
        Text(text = "Happy Birthday $recipient!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
            )
        Text(text = "from $sender",
            fontSize = 36.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End))
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayActivityTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HappyBirthdayInput(recipient = "Laura", sender = "Ycaro")
        }
    }
}