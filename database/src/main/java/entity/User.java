package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class User {
    private static int idScore = 1;

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = idScore;
        idScore++;
    }

    public User() {
        this.id = idScore;
        idScore++;
    }
}
