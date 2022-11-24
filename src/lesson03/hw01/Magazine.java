package lesson03.hw01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable {

    private int pages;
    private Language language;

    @Override
    public void print() {
        System.out.println("This is a magazine in lang \'" + getLanguage() + "\' , pages: " + getPages());
    }
}
