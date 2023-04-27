package lesson4.collections.Stream;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmailAddress {
    private String email;
    private String someData;

    public void setSomeData(String someData) {
        this.someData = someData;
    }
}
