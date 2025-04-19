package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@Composable
fun ShowEditText() {
    val state = remember { mutableStateOf("") }
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

@Composable
fun DefaultPreviewFunction() {
    /*Column {
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }*/

    /*Row {
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }*/

    Box(contentAlignment = Alignment.Center) {
        Image(painterResource(id = R.drawable.heart_image), contentDescription = "Heart Image")
        //Image(painterResource(id = R.drawable.arrows_png),contentDescription = "Arrow Image")
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewFunction() {
    TextModifier()
}


@Composable
fun ListViewItem(imageId:Int,name: String,occupation: String) {
    Row {
        Image(
            painterResource(id = imageId),
            contentDescription = "Profile Image",
            Modifier.size(50.dp)
        )

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontSize = 15.sp, fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
fun TextModifier(){
    Text(
        text = "Hello Ayush",
        color = Color.Black,
        modifier = Modifier.background(Color.Blue)
            .size(200.dp)
            .border(4.dp,Color.Red)
            .padding(30.dp)
            .clip(RectangleShape)
            .background(Color.Yellow)
        )
}
