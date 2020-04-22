package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.User;
import com.twu.biblioteca.Repositories.UsersRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieControllerTest {
    MovieController movieController = new MovieController();
    UsersRepository usersRepository = new UsersRepository();
    User user = usersRepository.getUsers().get(0);

    @Test
    public void CheckOutMovieShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you! Enjoy the movie ---";

        // when
        String response = movieController.CheckOutMovie("2", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void CheckOutMovieShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- Sorry, that movie is not available ---";

        // when
        String response = movieController.CheckOutMovie("1", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnMovieShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you for returning the movie. ---";

        // when
        String response = movieController.ReturnMovie("1", user);

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnMovieShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- This is not a valid movie to return. ---";

        // when
        String response = movieController.ReturnMovie("3", user);

        // then
        assertEquals(responseMock, response);
    }
}
