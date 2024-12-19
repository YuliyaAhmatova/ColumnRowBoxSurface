package com.example.columnrowboxsurface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    private val persons: MutableList<Person> = Person.persons

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 1.dp, Color.Black)
                        .background(Color.DarkGray)

                ) {
                    Text(
                        "Данные по персоналу:",
                        fontSize = 28.sp,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 1.dp, Color.Black)
                        .background(Color.LightGray),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        "Имя",
                        fontSize = 26.sp
                    )
                    Text(
                        "Зарплата",
                        fontSize = 26.sp
                    )
                    Text(
                        "Телефон",
                        fontSize = 26.sp
                    )
                }
                for (i in persons.indices) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(width = 1.dp, Color.Black),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            persons[i].name,
                            fontSize = 18.sp
                        )
                        Text(
                            persons[i].salary,
                            fontSize = 18.sp
                        )
                        Text(
                            phone(),
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    }

    fun phone(): String {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        val first = "+79"
        var second = ""
        for (i in 0..8) {
            second += numbers.random().toString()
        }
        val phone = first + second
        return phone
    }
}
