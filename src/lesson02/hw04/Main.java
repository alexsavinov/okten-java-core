package lesson02.hw04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User user = new User(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)),
                new Car("toyota", 2021, 250)
        );

        System.out.println("----------------------------");
        System.out.println("User created: " + user);
    }
}
