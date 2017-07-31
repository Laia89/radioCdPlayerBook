package main.java.exercises.book;
import java.util.*;

public class Main {

    /*3- Cread las clases Book y Chapter. Book tendrá author (o si queréis complicarlo, authors),
            title y chapters (una List de chapters). Chapter tendrá title y page. Book tendrá un método que devolverá
            el número total de páginas del libro, y en su método toString retornará los datos del libro junto a los títulos
            de capítulos junto con su número de páginas, por ejemplo así:

            Head First Java
            by Kathy Sierra
            1 - Breaking the Surface: page 1
            2 - A Trip to Objectville: page 27
            3 - Know Your Variables: page 49
            etc.*/
    public static void main (String[] args) {
        Chapter chapter1 = new Chapter("Breaking the Surface", 26);
        Chapter chapter2 = new Chapter("A Trip to Objectville", 22);
        Chapter chapter3 = new Chapter("Know Your Variables", 53);

        List<Chapter> chapters = Arrays.asList(chapter1, chapter2, chapter3);
        Book bookJava = new Book("Head First Java", "Kathy Sierra", chapters);
        System.out.println(bookJava);

        int totalPages = bookJava.totalPages();
        System.out.println(totalPages);

    }
}
