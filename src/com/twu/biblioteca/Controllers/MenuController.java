package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {
    Scanner scan = new Scanner(System.in);

    public MenuController() {
        BooksRepository booksRepository = new BooksRepository();
    }

    public boolean ShowMenu(String clientName) {
        System.out.println("Hello " + clientName + ", would you like to see the list of available books?");
        String clientOption = scan.next();

        if (clientOption.equals("yes") ) {
            AvailableBooksList();
        }

        return true;
    }

    private static void AvailableBooksList() {
        System.out.println("List of available books:");

        BooksRepository booksRepository = new BooksRepository();
        ArrayList<Book> books = booksRepository.getBooks();

        System.out.println("---------------------------------------");
        books.forEach((k)->System.out.println("- " + k.getName() + " | " + k.getAuthor() + " | "+ k.getYearPublished()));
        System.out.println("---------------------------------------");
    }
}
