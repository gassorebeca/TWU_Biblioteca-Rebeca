package com.twu.biblioteca.Models;

import java.util.ArrayList;

public class User {
    private int LibraryNumber;
    private String Name;
    private String Password;
    private ArrayList<Book> BooksCheckedOut;
    private ArrayList<Movie> MoviesCheckedOut;

    public ArrayList<Book> getBooksCheckedOut() { return BooksCheckedOut; }

    public void setBooksCheckedOut(ArrayList<Book> booksCheckedOut) { BooksCheckedOut = booksCheckedOut; }

    public ArrayList<Movie> getMoviesCheckedOut() { return MoviesCheckedOut; }

    public void setMoviesCheckedOut(ArrayList<Movie> moviesCheckedOut) { MoviesCheckedOut = moviesCheckedOut; }

    public int getLibraryNumber() {
        return LibraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        LibraryNumber = libraryNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
