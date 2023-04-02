package lesson2.HW.task1;

import java.util.ArrayList;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private  int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
