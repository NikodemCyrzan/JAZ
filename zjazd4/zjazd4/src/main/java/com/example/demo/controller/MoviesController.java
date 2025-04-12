package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.MoviePartial;
import com.example.demo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable int id) {
        Movie movie = movieService.getMovie(id);
        if (movie == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody MoviePartial movie) {
        if (!movieService.isMoviePartialValid(movie)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Movie addedMovie = movieService.addMovie(movie);

        return ResponseEntity.ok(addedMovie);
    }
}
