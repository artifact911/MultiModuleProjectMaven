package controller;

import service.UserService;

public class UserController {

    private final UserService userService = new UserService();

    public void showUserById(int id) {
        System.out.println(userService.getUserBuId(id));
    }
}
