package com.example.customlistview;

public class Movie {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String title;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    private String year;
}
