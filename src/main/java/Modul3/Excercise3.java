package Modul3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by &[User] and &[Date].
 */
public class Excercise3 {

    public static void main(String[] args) {
        LinkedList<Book> linkedList = new LinkedList<>();
        for(int i=0;i<30000;i++){
            linkedList.add(new Book("author"+i/50,"title"+i, 1991+i/1000));
        }


        long begin = System.nanoTime();
        linkedList.get(1);
        long end = System.nanoTime();
        System.out.println("wyszukiwanie obiektu z poczatku linkedListy w czasie :" + (end-begin));


        begin = System.nanoTime();
        linkedList.get(30000-1);
        end = System.nanoTime();
        System.out.println("wyszukiwanie obiektu z końca linkedListy w czasie :" + (end-begin));

        begin = System.nanoTime();
        linkedList.remove(30000-1);
        end = System.nanoTime();
        System.out.println("usuwanie obiektu z końca linkedListy w czasie :" + (end-begin));

        begin = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        System.out.println("usuwanie obiektu z początku linkedListy w czasie :" + (end-begin));

        HashMap<Employee, Payment> paymentHashMap = new HashMap<>();
        for(int i=0;i<100000;i++){
            paymentHashMap.put(new Employee("Name"+ i,"Surname"+ i, LocalDate.of(1980+i/3000,i%11+1,i%25+1)),
                    new Payment(i%1500,i%500,i%3));
        }



       for(Map.Entry<Employee,Payment> entry : paymentHashMap.entrySet()){
           if(entry.getKey().getFirstName().equals("Name66371")){
               System.out.println(entry.getKey().toString());
           }
       }

    }

}
