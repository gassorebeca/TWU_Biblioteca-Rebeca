package com.twu.biblioteca.Repositories;

import com.twu.biblioteca.Models.Book;
import java.util.ArrayList;

public class BooksRepository {
    ArrayList<Book> books = new ArrayList<Book>(5);

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public BooksRepository() {
        Book theLordOfTheRings = new Book();
        BookCreator(theLordOfTheRings, 1,"The Lord of The Rings", "J. R. R. Tolkien", 1954, true);

        Book harryPotterTwo = new Book();
        BookCreator(harryPotterTwo, 2,"Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", 1999, true);

        Book aBriefHistoryOfTime = new Book();
        BookCreator(aBriefHistoryOfTime, 31,"A Brief History of Time", "Stephen Hawking", 1991, true);

        books.add(theLordOfTheRings); books.add(harryPotterTwo); books.add(aBriefHistoryOfTime);
    }

    private void BookCreator(Book name, int id, String title, String author, int yearPublished, boolean available) {
        name.setId(id);
        name.setName(title);
        name.setAuthor(author);
        name.setYearPublished(yearPublished);
        name.setAvailable(available);
    }
}
