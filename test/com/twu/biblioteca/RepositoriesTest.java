package com.twu.biblioteca;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepositoriesTest {

    @Test
    public void getBooksTest() {
        BooksRepository booksRepository = new BooksRepository();

        ArrayList<Book> booksMock = new ArrayList<Book>();

        ArrayList<Book> books = booksRepository.getBooks();

        assertNotEquals(booksMock, books);
    }
}
