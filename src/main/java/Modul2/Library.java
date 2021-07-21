package Modul2;

import java.util.LinkedList;

/**
 * Created by &[User] and &[Date].
 */
public class Library {

   private LinkedList<Book> listOfBooks=new LinkedList<Book>();

   //public Library (){
  //     this.listOfBooks=new LinkedList<Book>();
  // }

   public void addBook(Book book){
       listOfBooks.add(book);
   }

   public LinkedList<Book> getListOfBooks(){
       return listOfBooks;
   }


}
