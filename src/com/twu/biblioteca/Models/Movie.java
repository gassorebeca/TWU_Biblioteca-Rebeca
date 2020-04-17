package com.twu.biblioteca.Models;

public class Movie {
    private int Id;
    private String Name;
    private int YearPublished;
    private String Director;
    private String MovieRating;
    private Boolean available;

    public int getId() { return Id; }
    public void setId(int id) { Id = id; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public int getYearPublished() { return YearPublished; }
    public void setYearPublished(int yearPublished) { YearPublished = yearPublished; }

    public String getDirector() { return Director; }
    public void setDirector(String director) { Director = director; }

    public String getMovieRating() { return MovieRating; }
    public void setMovieRating(String movieRating) { MovieRating = movieRating; }

    public Boolean getAvailable() { return available; }
    public void setAvailable(Boolean available) { this.available = available; }
}
