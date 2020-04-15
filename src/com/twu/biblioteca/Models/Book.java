package com.twu.biblioteca.Models;

import java.util.Date;

public class Book
{
    private int id;
    private String name;
    private String author;
    private Boolean available;
    private int YearPublished;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
