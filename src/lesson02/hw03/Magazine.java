package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine extends Book {

    private String title;

    @Override
    public String toString() {
        return "Magazine{" +
                "color='" + super.getColor() + '\'' +
                ", pages='" + getPages() + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
