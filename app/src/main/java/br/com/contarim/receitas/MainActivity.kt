package br.com.contarim.receitas

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Column(

            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .background(color = Color.Green)
        ) {
            Image(
                painter = painterResource(br.com.contarim.receitas.R.drawable.chef),
                contentDescription = "Imagem de um Chef de cozinha.",
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
//                    .height(200.dp)
                    .background(color = Color.Yellow)
            ) {
                Text(
                    text = "RECEITAS ILIMITADAS",
                    fontSize = 24.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Comece cozinhar",
                    fontSize = 48.sp,
                    lineHeight = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFED1459)
                )
                Row{
                    Button(
                        onClick = {}
                    ) {
                        Text(
                            text = "Entrar"
                        )

                    }
                    Button(
                        onClick = {}
                    ) {
                        Text(
                            text = "Cadastrar"
                        )
                    }
                }

            }
        }


    }
}

@Composable
@Preview
fun initialScreenPreview(){
    ReceitasTheme() {
        InitialScreen()
    }
}