package starter;

import controller.UserController;

public class UserStarter {

    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.showUserById(3);
    }
}
