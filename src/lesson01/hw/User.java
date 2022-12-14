package lesson01.hw;

import lombok.*;

import java.util.Arrays;

/**
 * User - has name and skill.
 * <p>
 * Class with lombok annotations.
 * <p>
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

    /**
     * Overrides lombok's getter getSkill.
     * <p>
     * Fixes further processing.
     */
    public Skill[] getSkills() {
        if (skills == null) {
            return new Skill[]{};
        }
        return skills;
    }

    /**
     * Overrides lombok's method toString.
     * <p>
     * Fixes user's skill output.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", skill=" + Arrays.toString(getSkills()) +
                '}';
    }

}
