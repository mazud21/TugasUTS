package com.gmail.hmazud.sixth;

/**
 * Created by mhr on 11/04/2018.
 */

public class Movie {
    private String title, genre, year, rating;
    private int image;

    public Movie() {

    }
    public Movie(String title, String genre, String year, String rating, int image) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String name) {
        this.title = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String Rating) {
        this.rating = rating;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}