package lesson2.HW.task1;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

}
