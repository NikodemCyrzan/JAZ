package com.example.demo.model;

public class Movie extends MoviePartial {
    private final int id;

    public int getId() {
        return id;
    }

    public Movie(int id, String title, MovieCategory category, int length, String description) {
        super(title, category, length, description);
        this.id = id;
    }

    public static Movie from(MoviePartial movie, int id) {
        return new Movie(id, movie.getTitle(), movie.getCategory(), movie.getLength(), movie.getDescription());
    }
}



