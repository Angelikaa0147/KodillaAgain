package Modul2;

/**
 * Created by &[User] and &[Date].
 */
public class Book {
    private String title;
    private int year;

    public Book(String title, int year){
        this.title=title;
        this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
