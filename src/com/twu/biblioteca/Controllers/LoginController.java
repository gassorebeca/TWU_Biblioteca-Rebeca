package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.User;
import com.twu.biblioteca.Repositories.UsersRepository;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {
    Scanner scan = new Scanner(System.in);
    UsersRepository usersRepository = new UsersRepository();
    ArrayList<User> users= usersRepository.getUsers();

    public User Login(){
        System.out.println("----- Log into Biblioteca -----");

        System.out.println("- Library Number:");
        String libraryNumber = scan.next();

        System.out.println("- Password:");
        String password = scan.next();

        return validateLogin(libraryNumber,  password);
    }

    public User validateLogin(String stringLibraryNumber, String password){
        try{
            int libraryNumber = Integer.parseInt(stringLibraryNumber);

            for (User user: users) {
                if(user.getLibraryNumber() == libraryNumber && user.getPassword().equals(password))
                    return user;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
}
