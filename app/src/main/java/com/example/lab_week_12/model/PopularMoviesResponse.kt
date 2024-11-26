package com.example.lab_week_12.model

data class PopularMoviesResponse(
    val page: Int,
    val results: List<Movie>
)