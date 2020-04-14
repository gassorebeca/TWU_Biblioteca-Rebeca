package com.twu.biblioteca;

import org.junit.Test;
import com.twu.biblioteca.Controllers.MenuController;
import static org.junit.Assert.*;
import java.io.*;

public class ControllersTest {
    MenuController menuController= new MenuController();

    @Test
    public void shouldGetUserInput() {
        String clientOptionMock = "1";
        InputStream in = new ByteArrayInputStream(clientOptionMock.getBytes());
        System.setIn(in);

        assertEquals("add 5", menuController.ShowMenu("Rebeca"));
    }
}
