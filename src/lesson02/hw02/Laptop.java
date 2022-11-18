package lesson02.hw02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends PC{

    private String battery;

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + super.getProcessor() + '\'' +
                ", memory='" + super.getMemory() + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
