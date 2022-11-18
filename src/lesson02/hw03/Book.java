package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Papirus {

    private String battery;

    @Override
    public String toString() {
        return "Book{" +
                "processor='" + super.getProcessor() + '\'' +
                ", memory='" + super.getMemory() + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
