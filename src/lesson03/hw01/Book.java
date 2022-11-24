package lesson03.hw01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable{

    private int year;
    private Publisher publisher;

    @Override
    public void print() {
        System.out.println("This is a book of Publisher \'" + getPublisher() + "\' , year: " + getYear());
    }
}
