package com.twu.biblioteca.Controllers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieControllerTest {
    MovieController movieController = new MovieController();

    @Test
    public void CheckOutMovieShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you! Enjoy the movie ---";

        // when
        String response = movieController.CheckOutMovie("2");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void CheckOutMovieShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- Sorry, that movie is not available ---";

        // when
        String response = movieController.CheckOutMovie("1");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnMovieShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you for returning the movie. ---";

        // when
        String response = movieController.ReturnMovie("1");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnMovieShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- This is not a valid movie to return. ---";

        // when
        String response = movieController.ReturnMovie("3");

        // then
        assertEquals(responseMock, response);
    }
}
