package lesson04.hw02;

import java.util.ArrayList;
import java.util.List;

import static lesson04.Helper.divider;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Lorem");
        words.add("ipsum");
        words.add("dolor");
        words.add("sit");
        words.add("amet");
        words.add("consectetur");
        words.add("adipisicing");
        words.add("elit");
        words.add("Aliquam");
        words.add("aut");
        words.add("cum");
        words.add("debitis");
        words.add("delectus");
        words.add("id");
        words.add("eius");
        words.add("inventore");
        words.add("modi");
        words.add("nam");
        words.add("perferendis");
        words.add("quasi");

        System.out.println(divider);
        System.out.println("List of words -- sorted by alphabet ASC:");

        words.sort(String::compareTo);
        words.forEach(System.out::println);
    }
}
