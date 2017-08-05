package main.java.exercises.BookPrinter;

import main.java.exercises.book.Book;



public class MarkDownBookPrinter implements BookPrinter {
    private String format;

    public MarkDownBookPrinter() {
        this.format = "markdown";
    }

    @Override
    public String bookToString(Book book) {
        String bookToMarkdown = "#" + book.getTitle() + "\n\n##" + book.getAuthor();
        int i = 0;
        while ( i < book.getChapters().size() ) { bookToMarkdown += i + ". " + book.getChapters().get(i).getTitle() + "\n"; }
        System.out.println(bookToMarkdown);
        return bookToMarkdown;
    }
    /*   # BOOK_TITLE

        ## BOOK_AUTHOR

        1.  CHAPTER_TITLE
        2.  CHAPTER_TITLE
        3.  CHAPTER_TITLE*/

    @Override
    public String getFormat() {
        return this.format;
    }
}
