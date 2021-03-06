package com.twu.biblioteca.Controllers;

import java.util.Scanner;
import com.twu.biblioteca.Models.User;

public class MenuController {
    BookController bookController = new BookController();
    MovieController movieController = new MovieController();
    Scanner scan = new Scanner(System.in);

    Boolean quit = false;
    String book = "book";
    String movie = "movie";
    User user;

    public MenuController() { }

    public void ShowMenu(User client, String movieOrBook) {
        user = client;
        if(movieOrBook.equals("1"))
            ShowBookMenu(user.getName());
        else if(movieOrBook.equals("2"))
            ShowMovieMenu(user.getName());
        else
            ShowMyInformation();
    }
    private void ShowMyInformation(){
        System.out.println("------------- My Information ---------------");
        System.out.println("Name: " + user.getName() +"\nE-mail: "  + user.getEmail() + "\nPhone Number: " + user.getPhoneNumber() + "\n");

        System.out.println("--- My Books:");
        user.getBooksCheckedOut().forEach( bookFromMyList -> { System.out.println("- " + bookFromMyList.getName());});

        System.out.println("\n");

        System.out.println("--- My Movies:");
        user.getMoviesCheckedOut().forEach( moviesFromMyList -> { System.out.println("- " + moviesFromMyList.getName());});

        System.out.println("---------------------------------------");

        ShowBookMenu(user.getName());
    }

    private void ShowMovieMenu(String clientName) {
        do
        {
            System.out.println("Hello " + clientName + ". What would you like to do next?");
            System.out.println(" 1. List of Available Movies\n " +
                    "2. CheckOut Movie\n " +
                    "3. Return a Movie\n " +
                    "4. Show Books Menu\n " +
                    "5. My Information\n " +
                    "6. Quit the Application");
            String clientOption = scan.next();

            switch(clientOption) {
                case "1":
                    movieController.AvailableMoviesList();
                    break;
                case "2":
                    CheckOut(movie);
                    break;
                case "3":
                    Return(movie);
                    break;
                case "4":
                    ShowBookMenu(clientName);
                    break;
                case "5":
                    ShowMyInformation();
                    break;
                case "6":
                    quit = true;
                    GetOut();
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        } while(!quit);
    }

    private void ShowBookMenu(String clientName) {
        do
        {
            System.out.println("Hello " + clientName + ". What would you like to do next?");
            System.out.println(" 1. List of Available Books\n " +
                                "2. CheckOut Book\n " +
                                "3. Return a book\n " +
                                "4. Show Movies Menu\n " +
                                "5. My Information\n " +
                                "6. Quit the Application");
            String clientOption = scan.next();

            switch(clientOption) {
                case "1":
                    bookController.AvailableBooksList();
                    break;
                case "2":
                    CheckOut(book);
                    break;
                case "3":
                    Return(book);
                    break;
                case "4":
                    ShowMovieMenu(clientName);
                    break;
                case "5":
                    ShowMyInformation();
                    break;
                case "6":
                    quit = true;
                    GetOut();
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        } while(!quit);
    }

    private void CheckOut(String movieOrBook) {
        System.out.println("Enter the Id of the " + movieOrBook + " you want to checkout:");
        String movieOrBookId = scan.next();
        String response;

        if (movieOrBook.equals(book))
            response = bookController.CheckOutBook(movieOrBookId, user);
        else
            response = movieController.CheckOutMovie(movieOrBookId, user);

        System.out.println(response);
        System.out.println("---------------------------------------");
    }

    private void Return(String movieOrBook) {
        System.out.println("Enter the Id of the " + movieOrBook + " you want to return:");
        String movieOrBookId = scan.next();
        String response;

        if (movieOrBook.equals(book))
            response = bookController.ReturnBook(movieOrBookId, user);
        else
            response = movieController.ReturnMovie(movieOrBookId, user);

        System.out.println(response);
        System.out.println("---------------------------------------");
    }

    public static void GetOut() {
        System.out.println("Press Enter key to stop");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
