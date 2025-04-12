package com.example.demo.repository;

import com.example.demo.model.Movie;
import com.example.demo.model.MovieCategory;
import com.example.demo.model.MoviePartial;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {
    private final List<Movie> movies;

    public MovieRepository() {
        movies = new ArrayList<>();
        movies.add(new Movie(0, "The Shawshank Redemption", MovieCategory.DRAMA, 144, "A banker convicted of uxoricide forms a friendship over a quarter century with a hardened convict, while maintaining his innocence and trying to remain hopeful through simple compassion."));
        movies.add(new Movie(1, "The Godfather", MovieCategory.DRAMA, 175, "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.add(new Movie(2, "The Dark Knight", MovieCategory.ACTION, 152, "When a menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman, James Gordon and Harvey Dent must work together to put an end to the madness."));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovie(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public Movie addMovie(MoviePartial movie) {
        Movie addedMovie = Movie.from(movie, movies.size());
        movies.add(addedMovie);
        return addedMovie;
    }
}
