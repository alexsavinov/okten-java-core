package lesson03.hw02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements Instrument{

    private double size;

    @Override
    public void play() {
        System.out.println("This drum plays! And it's size: " + getSize());
    }
}
