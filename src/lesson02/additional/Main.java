package lesson02.additional;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Posts */
        List<Post> posts = new ArrayList<>();
        posts.add(Post.builder()
                .userId(1)
                .id(1)
                .title("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
                .body("")
                .build());
        posts.add(Post.builder()
                .userId(1)
                .id(2)
                .title("qui est esse")
                .body("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla")
                .build());
        posts.add(Post.builder()
                .userId(1)
                .id(3)
                .title("ea molestias quasi exercitationem repellat qui ipsa sit aut")
                .body("et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut")
                .build());
        System.out.println("----------------------------");
        System.out.println("Posts created with size of: " + posts.size());

        /* Comments */
        List<Comment> comments = new ArrayList<>();
        comments.add(Comment.builder()
                .postId(1)
                .id(1)
                .name("id labore ex et quam laborum")
                .email("Eliseo@gardner.biz")
                .body("laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium")
                .build());
        comments.add(Comment.builder()
                .postId(1)
                .id(2)
                .name("quo vero reiciendis velit similique earum")
                .email("Jayne_Kuhic@sydney.com")
                .body("est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et")
                .build());
        comments.add(Comment.builder()
                .postId(1)
                .id(3)
                .name("odio adipisci rerum aut animi")
                .email("Nikita@garfield.biz")
                .body("quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione")
                .build());
        comments.add(Comment.builder()
                .postId(2)
                .id(7)
                .name("repellat consequatur praesentium vel minus molestias voluptatum")
                .email("Dallas@ole.me")
                .body("maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor")
                .build());
        comments.add(Comment.builder()
                .postId(2)
                .id(8)
                .name("et omnis dolorem")
                .email("Mallory_Kunze@marie.org")
                .body("ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque")
                .build());
        comments.add(Comment.builder()
                .postId(3)
                .id(13)
                .name("aut inventore non pariatur sit vitae voluptatem sapiente")
                .email("Kariane@jadyn.tv")
                .body("fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et")
                .build());
        comments.add(Comment.builder()
                .postId(3)
                .id(14)
                .name("et officiis id praesentium hic aut ipsa dolorem repudiandae")
                .email("Nathan@solon.io")
                .body("vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum")
                .build());
        comments.add(Comment.builder()
                .postId(3)
                .id(15)
                .name("debitis magnam hic odit aut ullam nostrum tenetur")
                .email("Maynard.Hodkiewicz@roberta.com")
                .body("nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia")
                .build());

        System.out.println("----------------------------");
        System.out.println("Comments created with size of: " + comments.size());

        System.out.println("----------------------------");
        for (Post post : posts) {
            System.out.println("Post " + post.getId() + " (" + post.getTitle() + ")");

            List<Comment> commentList = new ArrayList<>();
            for (Comment comment : comments) {
                if (comment.getPostId() == post.getId()) {
                    commentList.add(comment);
                }
            }
            post.setComments(commentList);
            System.out.println("Comments added " + post.getComments().size());
        }

    }
}
