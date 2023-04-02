package lesson2.delegation;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private int id;
    private String model;
    private Engine engine;

    public void start(){
        this.getEngine().start();
    }

}
