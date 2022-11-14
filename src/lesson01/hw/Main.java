package lesson01.hw;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class for running test.
 */
@Data
public class Main {

    public static void main(String[] args) {
        System.out.println("Start of testing...");

        /* Setters */
        User user = new User();
        user.setId(1);
        user.setName("Username");
        user.setPassword("superpass");
        user.setSkills(new Skill[]{
                new Skill(1, "read"),
                new Skill(2, "write")
        });

        /* Getters */
        System.out.println("--------------------------");
        System.out.println("New user created: " + user);
        System.out.println("New user created with ID: " + user.getId());
        System.out.println("..and with Name: " + user.getName());
        System.out.println("..and with Skills: " + Arrays.toString(user.getSkills()));

        /* Builder */
        User user1 = new User.UserBuilder()
                .id(2)
                .name("SecondUser")
                .name("passsss")
                .skills(new Skill[]{
                        new Skill(1, "js"),
                        new Skill(2, "java"),
                        new Skill(3, "python")
                })
                .build();

        System.out.println("--------------------------");
        System.out.println("New user1 created: " + user1);

        /* ArrayList */
        ArrayList<User> workers = new ArrayList<>();
        workers.add(user);
        workers.add(user1);

        Company company = new Company.CompanyBuilder()
                .id(1)
                .name("Super Company")
                .workers(workers)
                .build();

        System.out.println("--------------------------");
        System.out.println("New Company created: " + company);
    }

}