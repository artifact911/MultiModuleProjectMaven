package dao;

import entity.User;
import utils.UserCreator;

import java.util.List;

public class UserDAO {

    private final List<User> userList = UserCreator.getUserList(20);

    public User getUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id).findAny().orElse(new User());
    }
}
