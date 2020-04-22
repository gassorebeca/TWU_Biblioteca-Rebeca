package com.twu.biblioteca.Repositories;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Models.User;
import java.util.ArrayList;

public class UsersRepository {
    ArrayList<User> users = new ArrayList<User>(5);

    public ArrayList<User> getUsers() { return users; }
    public void setUsers(ArrayList<User> users) { this.users = users; }

    public UsersRepository() {
        User gasso = new User();
        UserCreator(gasso, 1231234, "Rebeca Gasso", "rebeca123");

        User test = new User();
        UserCreator(test, 4564567, "Ana Test", "ana123");

        users.add(gasso); users.add(test);
    }

    private void UserCreator(User user, int libraryNumber, String name, String password) {
        user.setName(name);
        user.setLibraryNumber(libraryNumber);
        user.setPassword(password);
    }
}
