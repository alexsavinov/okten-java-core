package lesson03.hw02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum(22.1));
        instruments.add(new Trumpet(0.35));

        System.out.println("----------------------------");
        System.out.println("instruments: " + instruments);

        System.out.println("----------------------------");
        System.out.println("Calling method play() for each instrument:");
        instruments.forEach(instrument -> instrument.play());
    }
}
