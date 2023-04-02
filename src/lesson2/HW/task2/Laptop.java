package lesson2.HW.task2;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends PC{
    private TouchPad touchPad;

    public Laptop(Monitor monitor, CPU cpu, Ram ram, TouchPad touchPad) {
        super(monitor, cpu, ram);
        this.touchPad = touchPad;
    }
}

