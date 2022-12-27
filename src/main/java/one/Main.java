package one;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").age(31).gender(Gender.MALE).weight(80.0).height(180.0).occupation("UCU").build();
        System.out.println(user);
    }
}