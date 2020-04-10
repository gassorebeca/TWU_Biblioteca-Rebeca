package com.twu.biblioteca.Repositories;

import com.twu.biblioteca.Models.Book;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class BooksRepository {
    ArrayList<Book> books = new ArrayList<Book>(5);

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public BooksRepository()
    {
        try
        {
            Book theLordOfTheRings = new Book();
            BookCreator(theLordOfTheRings, "The Lord of The Rings", "J. R. R. Tolkien", 1954);

            Book harryPotterTwo = new Book();
            BookCreator(harryPotterTwo, "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", 1999);

            Book aBriefHistoryOfTime = new Book();
            BookCreator(aBriefHistoryOfTime, "A Brief History of Time", "Stephen Hawking", 1991);

            // ORDENAR OS LIVROS POR ORDEM ALFABETICA

            books.add(theLordOfTheRings); books.add(harryPotterTwo); books.add(aBriefHistoryOfTime);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void BookCreator(Book name, String title, String author, int yearPublished) {
        name.setName(title);
        name.setAuthor(author);
        name.setYearPublished(yearPublished);
    }

    private List<Book> getAvailableBooks() {
        return null;
    }
}
