package lesson3.demo1;

import java.util.List;

public class Helper extends Xxx implements ArrayPrinter {
    public void print (List<Integer> integerList){
        for(Integer integer : integerList){
            if(integer%2==0){
                System.out.println(integer);
            }

        }
    }


}
// Клас Helper не наслідує ArrayPrinter відповідно він не буде працювати в методі showListNumbers.
// ArrayPrinted і його нащадки це одне сімейство, а XXx i Helper інше відповідно ми не можемо застосувати логіку методу showListNumbers з класом Helper
//ми змінили клас на інтерфейс і таким чином замінивши extends на implements дали можливість методу showListNumbers застосовувати логіку всіх трьох класів
// в класі Helper крім наслідування класу Xxx ми додаємо implement інтерфейсу ArrayPrinter