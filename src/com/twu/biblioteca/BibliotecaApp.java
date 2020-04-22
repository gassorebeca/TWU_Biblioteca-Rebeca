package com.twu.biblioteca;

import com.twu.biblioteca.Controllers.LoginController;
import com.twu.biblioteca.Controllers.MenuController;
import com.twu.biblioteca.Models.User;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MenuController menuController = new MenuController();
        LoginController loginController = new LoginController();
        User client;

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        client = loginController.Login();

        if(client == null) {
            System.out.println("----- Library Number or Password incorrect! -----");
            menuController.GetOut();
        } else {
            System.out.println("What would you like to do?\n 1- Books\n 2- Movies\n 3- My Information\nEnter the number of your option:");
            String movieOrBook = scan.next();

            menuController.ShowMenu(client, movieOrBook);
        }

        scan.close();
    }
}
