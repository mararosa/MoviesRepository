package com.mararosa.moviesapp.movies.data.repository

import android.util.Log
import com.mararosa.moviesapp.movies.data.model.MovieData
import com.mararosa.moviesapp.movies.service.MoviesService
import javax.inject.Inject

interface MoviesRepository {
    suspend fun fetchPopularMovies(): List<MovieData>?
}

class MoviesRepositoryImpl @Inject constructor(
    private val service: MoviesService
) : MoviesRepository {

    override suspend fun fetchPopularMovies(): List<MovieData>? =
         service.fetchPopularMovies().movies
}