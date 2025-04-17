package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Text(text = "Hello Ayush Compose App")
        }
    }
}

@Composable
fun SayMyName(name: String = "Singh Compose App") {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        color = Color.Blue,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
fun ShowMyImage() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = "Compose Logo"
    )
}

@Composable
fun ShowMyButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Blue
        )
    ) {
        Text(text = "Click Me")

    }
}

@Preview(showBackground = true)
@Composable
fun ShowEditText(){
    val state  = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = {
            Text(text = "Enter Text Here")
        },
        maxLines = 1
    )
}
