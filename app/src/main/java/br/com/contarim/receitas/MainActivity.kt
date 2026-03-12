package br.com.contarim.receitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    ){
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(85.dp)
                .align(alignment = Alignment.TopEnd),

            shape = RoundedCornerShape(
                bottomStart = 85.dp
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFFED1459)
                )
        ){}
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
//                .background(color = Color.Green)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(br.com.contarim.receitas.R.drawable.chef),
                contentDescription = "Imagem de um Chef de cozinha.",
                modifier = Modifier
                    .size(190.dp)
            )
            Spacer(modifier = Modifier.height(100.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
//                    .height(200.dp)
//                    .background(color = Color.Yellow)
            ) {
                Text(
                    text = "RECEITAS ILIMITADAS",
                    fontSize = 24.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Vamos  Cozinhar",
                    fontSize = 48.sp,
                    lineHeight = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFED1459),
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
                )
                Row{
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFED1459)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color(0xFFFFC107)
                        ),
                        modifier = Modifier
                            .size(width = 128.dp, height = 48.dp)

                    ) {
                        Text(
                            text = "Entrar",
                            color = Color(0xFFFFFFFF),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFFFC107)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color(0xFFED1459)
                        ),
                        modifier = Modifier
                            .size(width = 128.dp, height = 48.dp)
                    ) {
                        Text(
                            text = "Cadastrar",
                            color = Color(0xFFED1459),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(85.dp)
                .align(alignment = Alignment.BottomStart),

            shape = RoundedCornerShape(
                topEnd = 85.dp
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFFED1459)
                )
        ){}
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun InitialScreenPreview(){
    ReceitasTheme{
        InitialScreen()
    }
}