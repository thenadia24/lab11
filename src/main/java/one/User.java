package one;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
@Getter
public class User extends Person{
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular(value = "occupation")
    private List<String> occupation;
}