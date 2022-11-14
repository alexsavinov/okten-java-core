package lesson01.hw;

import lombok.*;

import java.util.Arrays;

/**
 * User - has name and skills.
 * <p>
 * Class with lombok annotations, except toString().
 * With standard arrays.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private int id;
    private String name;
    private String password;
    private Skill[] skills;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", skills=" + Arrays.toString(getSkills()) +
                '}';
    }

}
