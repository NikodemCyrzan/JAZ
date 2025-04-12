package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.model.MoviePartial;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }

    public Movie getMovie(int id) {
        return movieRepository.getMovie(id);
    }

    public Movie addMovie(MoviePartial movie) {
        return movieRepository.addMovie(movie);
    }

    public boolean isMoviePartialValid(MoviePartial moviePartial) {
        if (moviePartial == null) {
            return false;
        }

        if (moviePartial.getCategory() == null) {
            return false;
        }

        if (moviePartial.getDescription() == null || moviePartial.getDescription().isEmpty()) {
            return false;
        }

        if (moviePartial.getLength() < 0) {
            return false;
        }

        if (moviePartial.getTitle() == null || moviePartial.getTitle().isEmpty()) {
            return false;
        }

        return true;
    }
}
