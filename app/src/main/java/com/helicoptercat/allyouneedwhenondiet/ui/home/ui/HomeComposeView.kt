package com.helicoptercat.allyouneedwhenondiet.ui.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.helicoptercat.allyouneedwhenondiet.R

@Composable
fun HomeComposeView() {
    var dayWight by remember { mutableStateOf("") }
    var nightWight by remember { mutableStateOf("") }
    var bodyFat by remember { mutableStateOf("") }
    var water by remember { mutableStateOf("") }
    var sleepingHours by remember { mutableStateOf("") }
    Column {

        TextField(
            value = dayWight,
            onValueChange = { dayWight = it },
            label = { Text(stringResource(R.string.day_wight)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )



        TextField(
            value = nightWight,
            onValueChange = { nightWight = it },
            label = { Text(stringResource(R.string.night_weight)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )




        TextField(
            value = bodyFat,
            onValueChange = { bodyFat = it },
            label = { Text(stringResource(R.string.body_fat)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )


        TextField(
            value = water,
            onValueChange = { bodyFat = it },
            label = { Text(stringResource(R.string.water)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )


        TextField(
            value = sleepingHours,
            onValueChange = { bodyFat = it },
            label = { Text(stringResource(R.string.sleeping_hour)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )


    }
}