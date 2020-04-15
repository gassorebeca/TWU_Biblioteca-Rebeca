package com.twu.biblioteca;

import com.twu.biblioteca.Controllers.MenuController;
import java.util.Scanner;

public class BibliotecaApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String clientName = scan.next();

        MenuController menuController = new MenuController();

        menuController.ShowMenu(clientName);

        scan.close();
    }
}
