package lesson2.HW.task2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop{
    private double weight;

//    public Ultrabook(TouchPad touchPad, double weight) {
//        super(touchPad);
//        this.weight = weight;
//    }

    public Ultrabook(Monitor monitor, CPU cpu, Ram ram, TouchPad touchPad, double weight) {
        super(monitor, cpu, ram, touchPad);
        this.weight = weight;
    }
}
