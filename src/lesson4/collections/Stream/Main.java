package lesson4.collections.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Роботу методів Java Stream API розберемо на прикладі офлайнової бібліотеки. Для кожної книги бібліотечного фонду відомі автор, назва та рік видання.
        //Для читача бібліотеки будемо зберігати ПІБ та електронну адресу. Кожен читач може взяти в бібліотеці одну або кілька книг — їх також збережемо.
        //Ще нам знадобиться flag читацької згоди на повідомлення електронною поштою. Розсилки організують співробітники бібліотеки: нагадують про термін повернення книг, повідомляють новини.

        //sort
        Library library = new Library();
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList()); //Метод collect(Collectors.toList()) замикає стрім до списку (List).

        //map

        //Метод використовується для перетворення об'єктів. Це може бути просте вилучення значення одного поля,
        // або створення об'єктів іншого типу за даними вихідного об'єкта

        // Task
        //Потрібно створити список розсилки (об'єкти типу EmailAddress) для усіх читачів бібліотеки.
        // При цьому flags згоди на розсилку не враховуватимемо: бібліотека закривається, тож хочемо оповістити всіх.

        List<EmailAddress> addresses = new ArrayList<>();
        for (Reader reader : library.getReaders()) {
            addresses.add(new EmailAddress(reader.getEmail(),"Library will close"));
        }
        //anyMatch()
//        true, якщо у stream є об'єкт, який задовольняє умову;
//        false – якщо такого об'єкта там немає.
        //перевірити, чи хтось із читачів бібліотеки взяв якісь книги King.
//        без лямда виразів
//        boolean result = false;
//        for (Reader reader : library.getReaders()){
//            for (Book book :reader.getBooks()){
//                if ("Stephen King".equals(book.getAuthor())){
//                    result = true;
//                    break;
//                }
//            }
//        }
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())//отримуємо stream зі всіх взятих книг
                .anyMatch(book -> "Stephen King".equals(book.getAuthor()));

    }

    //reduce()- залишає тільки один ел-т
    //Для цього в метод передаються початкове значення (необов'язковий параметр) і ф-ція-акумулятор з двома параметрами.
    //Спочатку ця функція застосовується до початкового значення і першого елементу стриму,
    // потім до отриманого на цьому етапі результату і наступного елементу стриму - і так до останнього елемента stream.
}
