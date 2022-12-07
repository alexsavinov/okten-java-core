package lesson04.hw03;

import java.util.*;

import static lesson04.Helper.divider;

public class Main {

    public static void main(String[] args) {

        /* Creating a list of users for further processing */
        List<User> users = new ArrayList<>();

        users.add(new User(
                1,
                "Leanne",
                "Graham",
                "Sincere@april.biz",
                21,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)),
                new Car("toyota", 2021, 250)
        ));

        users.add(new User(
                2,
                "Ervin",
                "Howell",
                "Shanna@melissa.tv",
                24,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 3),
                        new Skill("js", 10)),
                new Car("audi", 2000, 200)
        ));

        users.add(new User(
                3,
                "Clementine",
                "Bauch",
                "Nathan@yesenia.net",
                43,
                Gender.MALE,
                Arrays.asList(
                        new Skill("c#", 11),
                        new Skill("java", 13)),
                new Car("renault", 1998, 125)
        ));

        users.add(new User(
                4,
                "Patricia",
                "Lebsack",
                "Julianne.OConner@kory.org",
                24,
                Gender.FEMALE,
                Arrays.asList(new Skill("js", 3)),
                new Car("honda", 2004, 133)
        ));

        users.add(new User(
                5,
                "Chelsey",
                "Dietrich",
                "Lucio_Hettinger@annie.ca",
                22,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 5),
                        new Skill("java", 11)),
                new Car("skoda", 2004, 150)
        ));

        users.add(new User(
                6,
                "Dennis",
                "Schulist",
                "Karley_Dach@jasper.info",
                16,
                Gender.MALE,
                Arrays.asList(
                        new Skill("python", 1),
                        new Skill("js", 1)),
                new Car("saab", 2020, 220)
        ));

        users.add(new User(
                7,
                "Kurtis",
                "Weissnat",
                "Telly.Hoeger@billy.biz",
                47,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("c++", 10),
                        new Skill("go", 5),
                        new Skill("rust", 1),
                        new Skill("c#", 3)),
                new Car("suzuki", 1998, 121)
        ));

        users.add(new User(
                8,
                "Nicholas",
                "Runolfsdottir",
                "Sherwood@rosamond.me",
                25,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10)),
                new Car("jaguar", 2015, 350)
        ));

        users.add(new User(
                9,
                "Glenna",
                "Reichert",
                "Chaim_McDermott@dana.io",
                59,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("fortran", 30),
                        new Skill("c", 15)),
                new Car("bmw", 1977, 180)
        ));

        users.add(new User(
                10,
                "Clementina",
                "DuBuque",
                "Rey.Padberg@karina.biz",
                33,
                Gender.FEMALE,
                Arrays.asList(new Skill("c++", 12)),
                new Car("ford", 2022, 221)
        ));


        /* Creating a HashSet based on a list of users */
        Set<User> userHashSet = new HashSet<>(users);

        /* Removing users with the gender MALE */
        Iterator<User> userIterator = userHashSet.iterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getGender().equals(Gender.MALE)) {
                userIterator.remove();
            }
        }

        /* Another way to remove users */
        userHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));

        /* Print results */
        System.out.println(divider + "HashSet of \"not MALE\" users:");
        userHashSet.forEach(System.out::println);


        /* Creating a TreeSet based on a list of users */
        Set<User> userTreeSet = new TreeSet<>(users);

        /* Sort by number of skills and print results */
        System.out.println(divider + "TreeSet of users sorted by number of skills:");
        userTreeSet.stream()
                .sorted(Comparator.comparingInt(o -> o.getSkills().size()))
                .forEach(System.out::println);
    }
}
