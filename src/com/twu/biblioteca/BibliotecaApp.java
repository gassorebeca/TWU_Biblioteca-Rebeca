package com.twu.biblioteca;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Repositories.BooksRepository;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class BibliotecaApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);

        String clientName = scan.next();

        System.out.println("Hello " + clientName + ", would you like to see the list of available books?");
        String clientOption = scan.next();

        if (clientOption.equals("yes") ) {
            AvailableBooksList();
        }

        scan.close();
        GetOut();
    }

    private static void AvailableBooksList() {
        System.out.println("List of available books:");

        BooksRepository booksRepository = new BooksRepository();
        ArrayList<Book> books = booksRepository.getBooks();

        books.forEach((k)->System.out.println(k.getName()));
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
