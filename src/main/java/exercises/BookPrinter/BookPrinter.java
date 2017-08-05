package main.java.exercises.BookPrinter;
import main.java.exercises.book.Book;

/*
* interface BookPrinter, tiene un método bookToString y otro getFormat que son por defecto públicos y abstractos*/

public interface BookPrinter  {

    String bookToString(Book book);

    String getFormat();
}
