package lesson01.hw;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Company - unites users.
 * <p>
 * Class with lombok annotations.
 * <p>
 * With ArrayList.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {

    private int id;
    private String name;
    private ArrayList<User> workers;
}
