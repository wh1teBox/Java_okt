package lesson3.interfaces;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User implements Singer,Runner{
    private int id;
    private String name;

    @Override
    public void sing() {
        System.out.println("Sing Song about " + this.name);
    }

    @Override
    public int run(int avgSpeed) {
        return 1000/avgSpeed;
    }

    @Override
    public void stop() {

    }
}
