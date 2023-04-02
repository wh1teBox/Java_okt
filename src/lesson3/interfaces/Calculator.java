package lesson3.interfaces;

public interface Calculator {
    int calc(int a, int b);

    default void smth(){
         ////some logic
    }
}


