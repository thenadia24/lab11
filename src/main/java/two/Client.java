package two;

import lombok.Getter;
import lombok.Setter;

enum Gender {
    MALE, FEMALE
}

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;

    public static int idCounter = 0;
    public Client(String name, int age, String email,Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        id = ++idCounter;
    }
}