package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {
    BookController bookController = new BookController();
    BooksRepository booksRepository = new BooksRepository();

    Scanner scan = new Scanner(System.in);
    Boolean quit = false;

    public MenuController() {
    }

    public boolean ShowMenu(String clientName) {
        do
        {
            System.out.println("Hello " + clientName + ". What would you like to do next?");
            System.out.println(" 1. List of Available Books\n " +
                                "2. Quit the Application\n " +
                                "3. CheckOut Book");

            String clientOption = scan.next();

            switch(clientOption) {
                case "1":
                    bookController.AvailableBooksList();
                    break;
                case "2":
                    quit = true;
                    GetOut();
                    break;
                case "3":
                    chooseThBook();
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        } while(!quit);

        return true;
    }

    private void chooseThBook() {
        System.out.println("Enter the Id of the book you want to checkout:");
        String bookId = scan.next();

        bookController.checkOutBook(bookId);
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
