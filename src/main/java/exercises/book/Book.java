package main.java.exercises.book;
import java.util.*;


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
public class Book {
    //propiedades
    private String author;
    private String title;
    private List<Chapter> chapters;

    public Book(String title, String author, List<Chapter> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public int totalPages() {
        int totalPages = 0;
        for (int i=0; i<this.chapters.size(); i++) {
            Chapter chapter = this.chapters.get(i);
            totalPages += chapter.getPages();
        }
        return totalPages;
    }

    public String getAuthor() {return this.author;}

    public String getTitle() {return this.title;}

    public List<Chapter> getChapters() {return this.chapters;}

    public String toString() {
        String titleAuthor = this.title + "\n" + "by " + this.author + "\n";
        int countPages = 1;
        String strChapter = "";
        for (int i=0; i<this.chapters.size(); i++) {
            Chapter chapter = this.chapters.get(i);
            strChapter += i+1 + " - " + chapter.getTitle() + ": page " + countPages  + "\n";
            countPages += chapter.getPages();
        }
        return titleAuthor + strChapter;
    }

/*      Head First Java
        by Kathy Sierra
        1 - Breaking the Surface: page 1
        2 - A Trip to Objectville: page 27
        3 - Know Your Variables: page 49
        etc.*/
}
