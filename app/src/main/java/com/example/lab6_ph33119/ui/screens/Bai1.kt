package com.example.lab6_ph33119.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab6_ph33119.ui.screens.CinemaSeatBookingScreen
import com.example.lab6_ph33119.utils.createTheaterSeating
import com.example.lab6_ph33119.Movie
import com.example.lab6_ph33119.ui.components.MovieRow
import com.example.lab6_ph33119.ui.components.MovieScreen


@Preview
@Composable
fun Bai2(){
    MovieScreen(Movie.getSampleMovies())

}

@Composable
fun Bai1(){
    MovieRow(Movie.getSampleMovies())

}
@Composable
fun Bai3(){
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}