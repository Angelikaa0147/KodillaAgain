package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public interface ATM {

     boolean payment(double amount);
     boolean withdrawal (double amount);

     default void bankConnection(){
         System.out.println("successful connection");

     }

     static void endOfConnection(){
         System.out.println("End of connection");
     }

}
