package lesson3.interfaces;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student implements Singer {
    private String name;
    private String email;

    @Override
    public void sing() {
        System.out.println("Sing a song");
    }

    @Override
    public int run(int avgSpeed) {
        return 0;
    }

    @Override
    public void stop() {

    }
}
