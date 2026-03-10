package br.com.contarim.receitas

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.contarim.receitas.ui.theme.ReceitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReceitasTheme {

                }
            }
        }
    }

@Composable

fun InitialScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    ){
        Image(
            painter = painterResource(br.com.contarim.receitas.R.drawable.chef),
            contentDescription = "Imagem de um Chef de cozinha.",
            modifier = Modifier
                .align(alignment = Alignment.Center)
        )

    }
}
@Composable
@Preview
fun initialScreenPreview(){
    ReceitasTheme() {
        InitialScreen()
    }
}