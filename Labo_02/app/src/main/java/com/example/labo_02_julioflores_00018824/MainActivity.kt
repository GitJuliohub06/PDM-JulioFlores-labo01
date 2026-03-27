package com.example.labo_02_julioflores_00018824
import androidx.compose.runtime.setValue
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.labo_02_julioflores_00018824.ui.theme.Labo_02_JulioFlores_00018824Theme
import org.intellij.lang.annotations.JdkConstants
import kotlin.collections.mutableListOf


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Labo_02_JulioFlores_00018824Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MiListaDeUsuario(
                        Modifier.padding(innerPadding)
                    )
                }
            }
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
fun MiListaDeUsuario(modifier: Modifier = Modifier) {

    var listaUsuarios: MutableList<String> = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),

            ) {
            val usuario: MutableState<String> = remember { mutableStateOf("") }
            TextField(
                value = usuario.value,
                onValueChange = {
                    usuario.value = it
                },

            )

            Button(onClick = {
            listaUsuarios.add(usuario.value)
            }) {
                Text("Guardar")
            }

            Row(modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {
                Text("Listado de nombres y posicion en la lista",
                modifier = Modifier.width(150.dp))

                Button(onClick = {listaUsuarios.clear()}, ) {
                    Text("Limpiar")
                }

            }

            LazyColumn(modifier = Modifier.border(color = Blue, width = 2.dp, shape = RoundedCornerShape(size=8.dp))
                .fillMaxWidth()
                .weight(0.7f)) {
                itemsIndexed(listaUsuarios.toList()) { index, item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = item
                        )
                        Text(
                            text = (index + 1).toString()
                        )
                    }
                }
            }

        }
    }
}