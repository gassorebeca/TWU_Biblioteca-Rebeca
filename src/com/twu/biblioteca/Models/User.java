package com.twu.biblioteca.Models;

import java.util.ArrayList;

public class User {
    private int LibraryNumber;
    private String Password;
    private String Name;
    private String Email;
    private String phoneNumber;
    private ArrayList<Book> BooksCheckedOut;
    private ArrayList<Movie> MoviesCheckedOut;

    public User() {
        BooksCheckedOut = new ArrayList<Book>();
        MoviesCheckedOut = new ArrayList<Movie>();
    }

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

    public String getEmail() { return Email; }

    public void setEmail(String email) { Email = email; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void addBookToBooks(Book book) { BooksCheckedOut.add(book); }

    public void removeBookFromBooks(Book book) { BooksCheckedOut.remove(book); }

    public void addMovieToMovies(Movie movie) { MoviesCheckedOut.add(movie); }

    public void removeMovieFromMovies(Movie movie) { MoviesCheckedOut.remove(movie); }
}
