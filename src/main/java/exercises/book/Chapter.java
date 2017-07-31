package main.java.exercises.book;

public class Chapter {
    private String title;
    private int pages;

    public Chapter(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {return this.title;}

    public int getPages() {return this.pages;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return "Chapter :" + this.title + " has " + this.pages + " pages";
    }

}
