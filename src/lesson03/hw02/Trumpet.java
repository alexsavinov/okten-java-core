package lesson03.hw02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trumpet implements Instrument{

    private double diameter;

    @Override
    public void play() {
        System.out.println("This trumpet plays! And it's diameter: " + getDiameter());
    }
}
