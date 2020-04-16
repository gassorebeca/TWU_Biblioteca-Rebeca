package com.twu.biblioteca.Controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookControllerTest {
    BookController bookController = new BookController();

    @Test
    public void CheckOutBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        String responseMock = "--- Thank you! Enjoy the book ---";
        String response = bookController.CheckOutBook("1");

        assertEquals(responseMock, response);
    }

    @Test
    public void CheckOutBookShouldReturnNegativeMessageWhenGivenUnavailableId() {
        String responseMock = "--- Sorry, that book is not available ---";
        String response = bookController.CheckOutBook("32");

        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookShouldReturnPositiveMessageWhenGivenAvailableId() {
        String responseMock = "--- Thank you for returning the book. ---";
        String response = bookController.ReturnBook("32");

        assertEquals(responseMock, response);
    }

    @Test
    public void ReturnBookhouldReturnNegativeMessageWhenGivenUnavailableId() {
        String responseMock = "--- This is not a valid book to return. ---";
        String response = bookController.ReturnBook("1");

        assertEquals(responseMock, response);
    }
}
