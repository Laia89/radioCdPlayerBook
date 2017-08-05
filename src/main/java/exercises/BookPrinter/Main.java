package main.java.exercises.BookPrinter;

import main.java.exercises.book.Book;
import main.java.exercises.book.Chapter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        List<Chapter> chapters = new ArrayList<Chapter>();
        chapters.add(new Chapter("Breaking the Surface", 26));
        chapters.add(new Chapter("A Trip to Objectville", 22));
        chapters.add(new Chapter("Know Your Variables", 53));

        Book book = new Book("Head First Java", "Kathy Sierra", chapters);

        //Nota: podéis guardar eso en un archivo con extensión html y abrirlo en un navegador.
        saveFileInFormat(new HtmlBookPrinter(), book);
        saveFileInFormat(new MarkDownBookPrinter(), book);
    }

    private static void saveFileInFormat(BookPrinter formatPrinter, Book book) {
        try{
            PrintWriter writer = new PrintWriter("src/main/java/exercises/bookprinter/" + formatPrinter.getFormat() + "Book." + formatPrinter.getFormat(), "UTF-8");
            writer.print(formatPrinter.bookToString(book));
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception : " + e);
        }
    }

}
