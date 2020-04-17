package com.twu.biblioteca.Controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookControllerTest {
    BookController bookController = new BookController();

    @Test
    public void CheckOutBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you! Enjoy the book ---";

        // when
        String response = bookController.CheckOutBook("1");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void CheckOutBookShouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- Sorry, that book is not available ---";

        // when
        String response = bookController.CheckOutBook("32");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        // given
        String responseMock = "--- Thank you for returning the book. ---";

        // when
        String response = bookController.ReturnBook("32");

        // then
        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookhouldReturnNegativeMessageWhenGivenUnavailableId() {
        // given
        String responseMock = "--- This is not a valid book to return. ---";

        // when
        String response = bookController.ReturnBook("1");

        // then
        assertEquals(responseMock, response);
    }
}
