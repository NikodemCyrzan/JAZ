package com.example.demo.model;

public class MoviePartial {
    private final String title;
    private final MovieCategory category;
    private final int length;
    private final String description;

    public String getTitle() {
        return title;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public MoviePartial(String title, MovieCategory category, int length, String description) {
        this.title = title;
        this.category = category;
        this.length = length;
        this.description = description;
    }
}
