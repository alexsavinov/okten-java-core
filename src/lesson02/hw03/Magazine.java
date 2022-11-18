package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine extends Book {

    private int weight;

    @Override
    public String toString() {
        return "Magazine{" +
                "processor='" + super.getProcessor() + '\'' +
                ", memory='" + super.getMemory() + '\'' +
                ", battery='" + super.getBattery() + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
