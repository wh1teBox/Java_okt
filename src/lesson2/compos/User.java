package lesson2.compos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private CommonData commonData;


    public User(int id, String name, String surname) {
        this.id=id;
        this.commonData = new CommonData(name, surname);
    }
}

