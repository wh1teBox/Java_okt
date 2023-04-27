package lesson4.db;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {
    private int id;
    private String cityName;
    private int zip;

}
