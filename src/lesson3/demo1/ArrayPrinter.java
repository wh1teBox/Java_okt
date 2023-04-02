package lesson3.demo1;

import java.util.Arrays;
import java.util.List;

public abstract interface  ArrayPrinter {

//ми змінимо клас на interface для того, щоб мати можливість імплементувати різну логіку в метод в методі showListNumbers

    void print (List<Integer>numbers);
}
