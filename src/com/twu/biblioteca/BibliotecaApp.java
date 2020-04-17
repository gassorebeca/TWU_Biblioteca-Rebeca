package com.twu.biblioteca;

import com.twu.biblioteca.Controllers.MenuController;
import java.util.Scanner;

public class BibliotecaApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MenuController menuController = new MenuController();

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println("What is your name?");
        String clientName = scan.next();

        System.out.println("Do you wanna see the list of books or movies?\n 1- Books\n 2- Movies\nEnter the number of your option:");
        String movieOrBook = scan.next();

        menuController.ShowMenu(clientName, movieOrBook);

        scan.close();
    }
}
