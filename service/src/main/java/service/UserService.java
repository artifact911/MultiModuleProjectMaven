package service;

import dao.UserDAO;
import entity.User;

public class UserService {

    private final UserDAO userDAO = new UserDAO();

    public User getUserBuId(int id) {
        return userDAO.getUserById(id);
    }
}
