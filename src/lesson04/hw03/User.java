package lesson04.hw03;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.getId() - o.getId();
    }
}
