package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {
    Scanner scan = new Scanner(System.in);
    Boolean quit = false;

    public MenuController() {
        BooksRepository booksRepository = new BooksRepository();
    }

    public boolean ShowMenu(String clientName) {
        do
        {
            System.out.println("Hello " + clientName + ". What would you like to do next?");
            System.out.println(" 1. List of Available Books\n 2. Quit the Application");

            String clientOption = scan.next();

            switch(clientOption) {
                case "1":
                    AvailableBooksList();
                    break;
                case "2":
                    quit = true;
                    GetOut();
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        } while(!quit);

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

    private static void GetOut() {
        System.out.println("Press Enter key to stop");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
