package com.example.kasihreview.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kasihreview.R
import com.example.kasihreview.ui.theme.OpenSans

@Composable
@Preview
fun cardBerlapis(){
    Box(
        modifier = Modifier
            .width(86.dp)
            .height(134.dp)
            .background(color = Color(0xFF1F1D36))
    ) {
        Row {
            Spacer(
                modifier = Modifier
                    .width(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.batman),
                contentDescription = "",
                modifier = Modifier
                    .width(52.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            )
        }
        Row {
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Image(painter = painterResource(R.drawable.superman),
                contentDescription = "",
                modifier = Modifier
                    .width(52.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            )
        }
        Row {
            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )
            Image(painter = painterResource(R.drawable.spiderman),
                contentDescription = "",
                modifier = Modifier
                    .width(52.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            )
        }
        Image(painter = painterResource(R.drawable.godzilla),
            contentDescription = "",
            modifier = Modifier
                .width(52.dp)
                .clip(shape = RoundedCornerShape(5.dp))
        )

        Text(
            text = "Film-film penuh action dan drama",
            fontFamily = OpenSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp,
            color = Color(0xFFE9A6A6),
            modifier = Modifier
                .align(Alignment.Center)
        )


    }
}