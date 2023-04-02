package lesson2.HW.task4;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    private int postID;
    private int id;
    private String name;
    private String email;
    private String body;

}
