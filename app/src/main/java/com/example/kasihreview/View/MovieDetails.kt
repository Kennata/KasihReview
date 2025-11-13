package com.example.kasihreview.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.kasihreview.Model.MovieDetails
import com.example.kasihreview.Model.Movies
import com.example.kasihreview.ViewModel.KRviewModel

@Composable
fun movieDetails(navController: NavController, viewModel: KRviewModel){
    val movie by viewModel.movieDetailsState.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row {
            AsyncImage(
                model = "https://image.tmdb.org/t/p/w500"+movie.poster_Url,
                contentDescription = movie.title,
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
            )

            Column {
                movie.title?.let { Text(text = it) }
                movie.releaseYear?.let { Text(text = it) }
                movie.description?.let { Text(text = it) }
                movie.genres?.let {genres ->
                    for (genre in genres) {
                        Text(text = genre.name)
                    }
                }
            }
        }
    }
}