package main.java.exercises.BookPrinter;

import main.java.exercises.book.Book;
import main.java.exercises.book.Chapter;

import java.util.List;

/* Por ejemplo, HtmlBookPrinter devolverá "html" en su getFormat(),
y en bookToString(book) devolverá el libro en formato HTML, de esta manera:

* <h1>BOOK_TITLE</h1>
<h2>BOOK_AUTHOR</h1>
<ol>
<li>CHAPTER_TITLE</li>
<li>CHAPTER_TITLE</li>
<li>CHAPTER_TITLE</li>
</ol>
* */

public class HtmlBookPrinter implements BookPrinter {
    private String format;

    public HtmlBookPrinter() {
        this.format = "html";
    }

    @Override
    public String bookToString(Book book) {
        String bookToHtml = "<h1>" + book.getTitle() + "</h1><h2>" + book.getAuthor() + "</h2><ol>";
        for (Chapter chapter : book.getChapters()) {
            bookToHtml += "<li>" + chapter.getTitle() + "</li>";
        }
        bookToHtml += "</ol>";
        System.out.println(bookToHtml);
        return bookToHtml;
    }

    @Override
    public String getFormat() {
        return this.format;
    }
}
