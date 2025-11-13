package com.example.kasihreview.View

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.kasihreview.ViewModel.KRviewModel

@Composable
fun genreButton(genreDetails: GenreDetails, VM: KRviewModel){
    var containerColor by remember { mutableStateOf(0xFFFFFFFF) }
    Button(
        onClick = {
            if (containerColor == 0xFFFFFFFF) {
                containerColor = 0xFFE9A6A6
                VM.addGenre(genreDetails)
            }else{
                containerColor = 0xFFFFFFFF
                VM.removeGenre(genreDetails)
            }
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(containerColor),
            contentColor = Color.Black,
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = genreDetails.name)
    }
}