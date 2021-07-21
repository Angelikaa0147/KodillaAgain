package Modul3;

import java.time.LocalDate;

/**
 * Created by &[User] and &[Date].
 */
public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year=year;

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ']';
    }


    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        return this.title.equals(b.title) && this.author.equals(b.author) && this.year==b.year;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
