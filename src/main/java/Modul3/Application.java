package Modul3;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class Application {

    public static void main(String[] args) {
        Employee employee=new Employee("Jan","Kowalski", LocalDate.of(1992,11,20));
        Employee employee1=new Employee("Daniel","Kowalski", LocalDate.of(1990,5,25));
        Employee employee2=new Employee("Paweł","Koman", LocalDate.of(1985,1,5));
        Employee employee3=new Employee("Monika","Zawrotna", LocalDate.of(1980,12,21));
        Employee employee4=new Employee("Jan","Kowalski", LocalDate.of(1992,11,20));

        HashSet<Employee> listOfEmployes= new HashSet<>();
        listOfEmployes.add(employee);
        listOfEmployes.add(employee1);
        listOfEmployes.add(employee2);
        listOfEmployes.add(employee3);
        listOfEmployes.add(employee4);

        for(Employee e : listOfEmployes){
            System.out.println(e.toString());
        }


        Book book = new Book("Potop", "Hentryk Sienkiewicz" , 1991);
        Book book1 = new Book("Ogniem i mieczem", "Hentryk Sienkiewicz" , 2020);
        Book book2 = new Book("Krzyżacy", "Hentryk Sienkiewicz" , 1995);
        Book book3 = new Book("Lalka", "Bolesław Prus" , 1999);
        Book book4 = new Book("Kamizelka", "Bolesław Prus" , 1998);

        Order order = new Order(book, 2021,07,10);
        Order order1 = new Order(book2, 2021,07,11);
        Order order2 = new Order(book3, 2021,07,12);
        Order order3 = new Order(book2, 2021,07,13);
        Order order4 = new Order(book4, 2021,07,14);
        Order order5 = new Order(book1, 2021,07,15);

        //zapiszmy w kolejce
        ArrayDeque<Order> kolejkaZamowien = new ArrayDeque<>();
        kolejkaZamowien.offer(order);
        kolejkaZamowien.offer(order1);
        kolejkaZamowien.offer(order2);
        kolejkaZamowien.offer(order3);
        kolejkaZamowien.offer(order4);
        kolejkaZamowien.offer(order5);

        System.out.println("Ilość zamówień oczekujących " + kolejkaZamowien.size());
        System.out.println(kolejkaZamowien.peek());

    ///STOS ZADANIE DOMOWE

        ArrayDeque<Book> stosKsiazek = new ArrayDeque<>();
        //umieszczamy pięc książek na stosie
        stosKsiazek.push(book);
        stosKsiazek.push(book1);
        stosKsiazek.push(book2);
        stosKsiazek.push(book3);
        stosKsiazek.push(book4);

        //SPR ROZMIAR STOSU
        System.out.println(stosKsiazek.size());

        //usun wszystko
        int temp = stosKsiazek.size();
        for(int i=0; i<temp;i++){
            System.out.println("usuwam ze stosu " + stosKsiazek.peek());
            stosKsiazek.pop();


        }
        System.out.println("Po usunięciu elemtów rozmiar stosu wynosi : "+ stosKsiazek.size());

        /**************************************************************************/
        //ITERATOR
        HashSet<Employee> zbiorPracownikow = new HashSet<>();
        zbiorPracownikow.add(employee);
        zbiorPracownikow.add(employee1);
        zbiorPracownikow.add(employee2);
        zbiorPracownikow.add(employee3);
        zbiorPracownikow.add(employee4);

        //tworzymy iterator
        Iterator<Employee> iterator = zbiorPracownikow.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    /*
        System.out.println("__________________WHILE LOOP TEST___________________________");
        //napiszemy teraz prostą metodę która przetestuje działanie pętli while loop

        //losujemy liczę z przedziału od 0 do 100
        Random generator = new Random();
        int wylosowanaLiczba =0;
        int licznik=0;
        boolean czyZalogowany = false;
        //jeżeli wylosujemy liczbę >=70 to użytkownik się zalogował
        while (!czyZalogowany){
            wylosowanaLiczba=generator.nextInt(101);
            if(wylosowanaLiczba<70) {
                licznik++;
                System.out.println("Nieudane logowanie nr " + licznik + ", z liczbą błędu " + wylosowanaLiczba);
            }else {
                czyZalogowany=true;
                System.out.println("użytkownik zalogowany z liczbą " + wylosowanaLiczba);

            }

        }
        */

    /*
    //ZADANIE WYścigi SUM

        int sumA=1000;
        int sumB=0;
        Random generator = new Random();
        int licznik =0;
        int pierwszaLiczba= 0;
        int drugaLiczba =0;
        while(sumA>sumB){
            pierwszaLiczba=generator.nextInt(10);
            drugaLiczba=generator.nextInt(50);
            sumA+=pierwszaLiczba;
            sumB+=drugaLiczba;
            licznik++;
            System.out.println("_____________________________");
            System.out.println("Obieg pętli nr " + licznik);
            System.out.println("Pierwsza wylosowana liczba to: " + pierwszaLiczba + ", druga wylosowana liczba to: " + drugaLiczba);
            System.out.println("sumA wynosi : " + sumA + ", sumB wynosi : " + sumB);

        }
        */

    EvenNumbers evenNumbers= new EvenNumbers(50);
    evenNumbers.showAllNumbers();
    evenNumbers.showOnlyEvenNumbers();

    }
}
