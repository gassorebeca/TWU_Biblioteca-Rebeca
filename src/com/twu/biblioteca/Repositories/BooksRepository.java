package com.twu.biblioteca.Repositories;

import com.twu.biblioteca.Models.Book;
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
        Book bookOne = new Book();
        bookOne.setName("Book One");
        //bookOne.setAuthor("Author One");

        Book bookTwo = new Book();
        bookTwo.setName("Book Two");

        Book bookThree = new Book();
        bookThree.setName("Book Three");

        try
        {
            books.add(bookOne);
            books.add(bookTwo);
            books.add(bookThree);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private List<Book> getAvailableBooks() {
        return null;
    }
}
