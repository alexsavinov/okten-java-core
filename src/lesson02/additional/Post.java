package lesson02.additional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    private int id;
    private int userId;
    private String title;
    private String body;
    private List<Comment> comments;
}
