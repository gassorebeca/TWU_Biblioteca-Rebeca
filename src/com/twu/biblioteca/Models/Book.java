package com.twu.biblioteca.Models;

public class Book {
    private int Id;
    private String Name;
    private String Author;
    private Boolean Available;
    private int YearPublished;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Boolean getAvailable() {
        return Available;
    }

    public void setAvailable(Boolean available) {
        Available = available;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
    }
}
