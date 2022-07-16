package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserControllerTest {

    @Test
    void userControllerTest(){
        UserController controller = new UserController();
        controller.showUserById(5);
        assertTrue(true);
    }
}
