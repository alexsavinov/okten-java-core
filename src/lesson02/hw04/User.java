package lesson02.hw04;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;
}
