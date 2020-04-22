package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.User;
import com.twu.biblioteca.Repositories.UsersRepository;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookControllerTest {
    BookController bookController = new BookController();
    UsersRepository usersRepository = new UsersRepository();
    User user = usersRepository.getUsers().get(0);

    @Test
    public void CheckOutBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you! Enjoy the book ---";

        // when
        String response = bookController.CheckOutBook("1", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void CheckOutBookShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- Sorry, that book is not available ---";

        // when
        String response = bookController.CheckOutBook("32", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you for returning the book. ---";

        // when
        String response = bookController.ReturnBook("4", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookhouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- This is not a valid book to return. ---";

        // when
        String response = bookController.ReturnBook("1", user);

        // then
        assertEquals(responseMock, response);
    }
}
