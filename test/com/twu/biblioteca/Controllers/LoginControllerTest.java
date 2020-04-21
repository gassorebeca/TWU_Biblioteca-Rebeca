package com.twu.biblioteca.Controllers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.twu.biblioteca.Models.User;

public class LoginControllerTest {
    LoginController loginController = new LoginController();

    @Test
    public void ShouldReturnTheUser() {
        // given
        String libraryNumberMock = "1231234";
        String passwordMock = "rebeca123";
        String responseNameMock = "Rebeca Gasso";

        // when
        User response = loginController.validateLogin(libraryNumberMock, passwordMock);

        // then
        assertEquals(responseNameMock, response.getName());
    }

    @Test
    public void ShouldReturnNullWhenGivenWrongPassword() {
        // given
        String libraryNumberMock = "1231234";
        String passwordMock = "wrongpassword";

        // when
        User response = loginController.validateLogin(libraryNumberMock, passwordMock);

        // then
        assertEquals(null, response);
    }

    @Test
    public void ShouldReturnNullWhenGivenWrongLibraryNumber() {
        // given
        String libraryNumberMock = "0986543";
        String passwordMock = "rebeca123";

        // when
        User response = loginController.validateLogin(libraryNumberMock, passwordMock);

        // then
        assertEquals(null, response);
    }
}
