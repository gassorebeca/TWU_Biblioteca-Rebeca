package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.*;
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
            System.out.println("| ID | Book name | Author | Year Published |");
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

    public String CheckOutBook(String stringBookId, User user) {
        try {
            int bookId = Integer.parseInt(stringBookId);
            for (Book book: books) {
                if (book.getId() == bookId && book.getAvailable() == true) {
                    book.setAvailable(false);
                    user.addBookToBooks(book);

                    return "--- Thank you! Enjoy the book ---";
                }
            }

            return "--- Sorry, that book is not available ---";
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }

    public String ReturnBook(String stringBookId, User user) {
        try {
            int bookId = Integer.parseInt(stringBookId);
            for (Book book: books) {
                if (book.getId() == bookId && book.getAvailable() == false) {
                    book.setAvailable(true);
                    user.removeBookFromBooks(book);

                    return "--- Thank you for returning the book. ---";
                }
            }

            return "--- This is not a valid book to return. ---";
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
}
