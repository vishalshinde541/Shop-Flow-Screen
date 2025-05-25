package com.example.shopflowscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopflowscreen.ui.theme.AppFonts.CenturyOldStyleBold
import com.example.shopflowscreen.ui.theme.AppFonts.NeuzeitSLTStdBook
import com.example.shopflowscreen.ui.theme.AppFonts.NeuzeitSdBook
import com.example.shopflowscreen.ui.theme.AppFonts.Tangerine
import com.example.shopflowscreen.ui.theme.ShopFLowScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShopFLowScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Hello $name!",

            )
        // In your composables:
        Text(
            text = "CenturyOldStyleBold text",
            fontFamily = CenturyOldStyleBold,
            fontSize = 24.sp
        )

        Text(
            text = "NeuzeitSLTStdBook text",
            fontFamily = NeuzeitSLTStdBook,
            fontSize = 36.sp
        )

        Text(
            text = "NeuzeitSdBook text",
            fontFamily = NeuzeitSdBook,
            fontSize = 36.sp
        )

        Text(
            text = "Tangerine text",
            fontFamily = Tangerine,
            fontSize = 20.sp
        )

        Image(
            painter = painterResource(R.drawable.cart3),
            contentDescription = "cart icon",
            modifier = Modifier.size(100.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShopFLowScreenTheme {
        Greeting("Android")
    }
}