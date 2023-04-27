package lesson4.collections.Stream;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Reader {
    private String fio;
    private String email;
    private boolean subscriber;
    private List<Book> books;


    public boolean isSubscriber() {
        return subscriber;
    }
}
