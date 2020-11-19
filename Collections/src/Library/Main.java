package Library;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> shelf = new ArrayList<Book>();
        shelf.add(new Book("Free with trial", "amazon", 222, 325));
        shelf.add(new Book("The miracle of your mind", "Dr. Joseph", 369, 958));
        shelf.add(new Book("Harry Potter", "J. K. Rowling", 2396, 1000));
        shelf.add(new Book("Fantastic beasts and where to find them", "J. K. Rowling", 215, 100));
        Collections.sort(shelf);
        for (Book b :
                shelf) {
            System.out.println(b.toString());
        }

    }
}
