package utils;

import entity.User;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@UtilityClass
public class UserCreator {

    public List<User> getUserList(int amount) {
        Random random = new Random();
        List<User> users = new ArrayList<>();
        List<String> fn = List.of("Bruce", "Cheep", "Dale", "Terminator", "Bull", "Jack", "John", "Alf");
        List<String> ln = List.of("Lee", "Sparrow", "Baden", "Rambo", "VanDame", "Simpson", "Chicago", "Potter");

        while (users.size() < amount) {
            users.add(new User(fn.get(random.nextInt(fn.size())), ln.get(random.nextInt(ln.size())), random.nextInt(50)));
        }
        return users;
    }
}
