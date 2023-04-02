package lesson2.HW.task4;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Post {
    private int userId;
    private int Id;
    private String title;
    private String body;
    private Comment comments;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        Id = id;
        this.title = title;
        this.body = body;
    }

  public Comment getComments (){
        return comments;
  }
}
