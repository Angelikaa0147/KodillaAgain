package Modul3;

import java.time.LocalDate;

/**
 * Created by &[User] and &[Date].
 */
public class Order {

    private Book book;
    private LocalDate localDate;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.localDate = LocalDate.of(year, month, day);
    }


    public Book getBook() {
        return book;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString(){
        return "-------------------------------\nThe order created : " + localDate + "\n"  + book.toString();
    }

}
