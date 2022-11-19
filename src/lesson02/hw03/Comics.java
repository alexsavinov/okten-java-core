package lesson02.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comics extends Book {

    private String series;

    @Override
    public String toString() {
        return "Comics{" +
                "color='" + super.getColor() + '\'' +
                ", pages='" + getPages() + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
