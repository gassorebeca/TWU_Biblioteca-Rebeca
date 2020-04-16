package com.twu.biblioteca.Controllers;

import java.util.Scanner;

public class MenuController {
    BookController bookController = new BookController();

    Scanner scan = new Scanner(System.in);
    Boolean quit = false;

    public MenuController() { }

    public boolean ShowMenu(String clientName) {
        do
        {
            System.out.println("Hello " + clientName + ". What would you like to do next?");
            System.out.println(" 1. List of Available Books\n " +
                                "2. CheckOut Book\n " +
                                "3. Return a book\n " +
                                "4. Quit the Application");

            String clientOption = scan.next();

            switch(clientOption) {
                case "1":
                    bookController.AvailableBooksList();
                    break;
                case "2":
                    ChooseTheBookToCheckOut();
                    break;
                case "3":
                    ChooseTheBookToReturn();
                    break;
                case "4":
                    quit = true;
                    GetOut();
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        } while(!quit);

        return true;
    }

    private void ChooseTheBookToCheckOut() {
        System.out.println("Enter the Id of the book you want to checkout:");
        String bookId = scan.next();

        String response = bookController.CheckOutBook(bookId);

        System.out.println(response);
        System.out.println("---------------------------------------");
    }

    private void ChooseTheBookToReturn() {
        System.out.println("Enter the Id of the book you want to return:");
        String bookId = scan.next();

        String response = bookController.ReturnBook(bookId);

        System.out.println(response);
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
