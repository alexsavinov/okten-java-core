package lesson04.hw01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static lesson04.Helper.divider;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Leanne Graham", 21));
        users.add(new User(2, "Ervin Howell", 24));
        users.add(new User(3, "Clementine Bauch", 43));
        users.add(new User(4, "Patricia Lebsack", 24));
        users.add(new User(5, "Chelsey Dietrich", 22));
        users.add(new User(6, "Mrs. Dennis Schulist", 16));
        users.add(new User(7, "Kurtis Weissnat", 47));
        users.add(new User(8, "Nicholas Runolfsdottir V", 25));
        users.add(new User(9, "Glenna Reichert", 59));
        users.add(new User(10, "Clementina DuBuque", 33));

        System.out.println(divider + "List of users -- sorted by age ASC:");
        users.sort(Comparator.comparingInt(User::getAge));
        users.forEach(System.out::println);

        System.out.println(divider + "List of users -- sorted by age DESC:");
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.forEach(System.out::println);

        System.out.println(divider + "List of users -- sorted by name length ASC:");
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        users.forEach(System.out::println);

        System.out.println(divider + "List of users -- sorted by name length DESC:");
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        users.forEach(System.out::println);
    }
}
