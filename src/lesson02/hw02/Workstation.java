package lesson02.hw02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workstation extends Laptop {

    private String format;

    @Override
    public String toString() {
        return "Workstation{" +
                "processor='" + super.getProcessor() + '\'' +
                ", memory='" + super.getMemory() + '\'' +
                ", battery='" + super.getBattery() + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
