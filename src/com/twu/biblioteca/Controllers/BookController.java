package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;

import java.util.ArrayList;

public class BookController {
    BooksRepository booksRepository = new BooksRepository();
    ArrayList<Book> books = booksRepository.getBooks();

    public BookController() { }

    public void AvailableBooksList() {
        try{
            System.out.println("List of available books:");

            System.out.println("---------------------------------------");
            books.forEach(
                    book -> {
                        if(book.getAvailable())
                            System.out.println("- " + book.getId() +" | " + book.getName() + " | " + book.getAuthor() + " | "+ book.getYearPublished());
                    });
            System.out.println("---------------------------------------");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void checkOutBook(String stringBookId) {
        try {
            int bookId = Integer.parseInt(stringBookId);

            books.forEach(book -> {
                     if (book.getId() == bookId)
                         book.setAvailable(false);
                    });
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
