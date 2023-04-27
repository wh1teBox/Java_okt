package lesson4.collections.set.treeset;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User implements Comparable<User> {
        private int id;
        private String name;

    @Override
    public int compareTo(User user ) {
        return this.id - user.getId()   ;
    }
}
