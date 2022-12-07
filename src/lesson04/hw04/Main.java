package lesson04.hw04;

import lesson04.hw01.User;

import static lesson04.Helper.divider;

public class Main {

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        /* 1) додати учасника в клуб */
        Person person1 = new Person(1, "Leanne Graham");
        Person person2 = new Person(2, "Ervin Howell");
        Person person3 = new Person(3, "Clementine Bauch");

        zooClub.addPerson(person1);
        zooClub.addPerson(person2);
        zooClub.addPerson(person3);

        System.out.println(divider + "1) додати учасника в клуб:");
        zooClub.getClub().entrySet().forEach(System.out::println);

        /* 2) додати тваринку до учасника клубу */
        Pet pet1 = new Pet(1, "cat");
        Pet pet2 = new Pet(2, "dog");

        zooClub.addPetToPerson(person1, pet1);
        zooClub.addPetToPerson(person2, pet1);
        zooClub.addPetToPerson(person3, pet2);

        System.out.println(divider + "2) додати тваринку до учасника клубу:");
        zooClub.getClub().entrySet().forEach(System.out::println);

        /* 3) видалити тваринку з власника */
        zooClub.deletePetFromPerson(pet2, person3);

        System.out.println(divider + "3) видалити тваринку з власника:");
        zooClub.getClub().entrySet().forEach(System.out::println);

        /* 4) видалити учасника клубу */
        zooClub.deletePerson(person3);

        System.out.println(divider + "4) видалити учасника клубу:");
        zooClub.getClub().entrySet().forEach(System.out::println);

        /* 5) видалити конкретну тваринку з усіх власників */
        /* 6) вивести на екран зооклуб */
        zooClub.deletePetFromAllPersons(pet1);
        System.out.println(divider + "5) видалити конкретну тваринку з усіх власників:");
        zooClub.getClub().entrySet().forEach(System.out::println);
    }
}
