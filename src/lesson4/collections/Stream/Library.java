package lesson4.collections.Stream;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Library {
    private List<Book> books;
    private List<Reader> readers;


    private void init (){
        books = new ArrayList<>();
        books.add(new Book("Stephen King", "Kery", 1974));

        readers = new ArrayList<>();
        readers.add(new Reader("Oksana Syrotiuk", "gfgfg@fhfh.com", true, books));
    }
}
