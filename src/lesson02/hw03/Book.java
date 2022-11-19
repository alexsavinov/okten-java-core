package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Papyrus {

    private int pages;

    @Override
    public String toString() {
        return "Book{" +
                "color='" + super.getColor() + '\'' +
                ", pages='" + getPages() + '\'' +
                '}';
    }
}
