package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comics extends Book {

    private String format;

    @Override
    public String toString() {
        return "Comics{" +
                "processor='" + super.getProcessor() + '\'' +
                ", memory='" + super.getMemory() + '\'' +
                ", battery='" + super.getBattery() + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
