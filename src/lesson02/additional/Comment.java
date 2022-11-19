package lesson02.additional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;

}
