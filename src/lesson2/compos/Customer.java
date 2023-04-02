package lesson2.compos;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private CommonData commonData;
    private int age;
    private String email;


}
