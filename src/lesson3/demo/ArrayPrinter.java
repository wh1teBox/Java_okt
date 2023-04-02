package lesson3.demo;

import java.util.List;

//public class ArrayPrinter {
//    //цей метод закритий для розширення, тобто його ніхто не може змінити
//    public void print(List<Integer> numbers,boolean flag) {
//        if (flag){
//            for (Integer number: numbers ){
//                System.out.println(number);
//            }
//            // ritar ітерація у зворотному напрямку
//        } else {
//            for (int i = numbers.size() - 1; i >= 0; i--) {
//                System.out.println(numbers.get(i));
//
//            }
//
//        }
//    }
//
////    public void print(List<Integer> numbers) {
////       for (Integer number : numbers){
////            System.out.println(number);
////        }
////    }
//
//
//}

//щоб зробити клас ArrayPrinter відкритим для наслідуванням потрібно перетворити його на абстрактний і метод print в ньому також буде абстрактним

public abstract class ArrayPrinter{


    public abstract void print(List<Integer> numbers);
}