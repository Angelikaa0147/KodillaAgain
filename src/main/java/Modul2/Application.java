package Modul2;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by &[User] and &[Date].
 */
public class Application {

    public static void main(String[] args) {


        Grade grade = new Grade();
        grade.addGrades(5);
        grade.addGrades(3);
        grade.addGrades(2);
        grade.addGrades(5);
        System.out.println(grade.average());
        System.out.println(grade.averageWithoutExtremeGrades());

        Library library=new Library();
        library.addBook(new Book("Title 1", 1995));
        library.addBook(new Book("Title 2", 2015));
        library.addBook(new Book("Title 3", 1998));
        library.addBook(new Book("Title 4", 2011));
        library.addBook(new Book("Title 5", 2020));
        library.addBook(new Book("Title 6", 2021));
        library.addBook(new Book("Title 7", 1999));

        System.out.println((library.getListOfBooks().get(0)));

        for(Book e : library.getListOfBooks()){
            if(e.getYear()<=2000){
                System.out.println(e.getTitle() + ", rok wydania : " + e.getYear());
            }
        }

        Employee employee1=new Employee("Jan", "Kowalski", "123456");
        Employee employee2=new Employee("Jan2", "Kowalski", "123456");
        Employee employee3=new Employee("Jan3", "Kowalski", "123456");

        System.out.println("CZY ZMIENNE EMPLOYEE1 i EMPLOYEE2 SĄ SOBIE RÓWNE ? " + (employee1==employee2));
        System.out.println("CZY ZMIENNE EMPLOYEE1 i EMPLOYEE3 SĄ SOBIE RÓWNE ? " + (employee1==employee3));
        System.out.println("CZY ZMIENNE EMPLOYEE1 i EMPLOYEE3 SĄ SOBIE RÓWNE - metoda equals ? " + (employee1.equals(employee2)));

        SalaryPayments salaryPayments=new SalaryPayments(12545,4542);
        SalaryPayments salaryPayments1=new SalaryPayments(2545,442);
        SalaryPayments salaryPayments2=new SalaryPayments(5565,0);

        HashMap<Employee, SalaryPayments> paymentsParameters = new HashMap<>();

        paymentsParameters.put(employee1,salaryPayments);
        paymentsParameters.put(employee2,salaryPayments1);
        paymentsParameters.put(employee3,salaryPayments2);

        System.out.println("SALARY OF WORKER= " + paymentsParameters.get(employee1));
        System.out.println(paymentsParameters.size());

        //for eaach po entry

        for(Map.Entry<Employee,SalaryPayments> entry: paymentsParameters.entrySet()){
            System.out.println(entry.getKey().toString() + " , " + entry.getValue().toString());
        }

        System.out.println("________________________________________________________________________");

        Uczen uczen = new Uczen("Jan Kowalski", 2);
        Uczen uczen1 = new Uczen("Piotr Nowak", 3);
        Uczen uczen2 = new Uczen("Anna Kowal", 6);

        Oceny oceny = new Oceny();
        oceny.uzupelnijDziennik(5);
        oceny.uzupelnijDziennik(2);
        oceny.uzupelnijDziennik(2);
        oceny.uzupelnijDziennik(4);

        DziennikKlasowy dziennikKlasowy = new DziennikKlasowy();
        dziennikKlasowy.uzupelnijDziennikKlasowy(uczen, oceny);
        dziennikKlasowy.uzupelnijDziennikKlasowy(uczen1, oceny);
        dziennikKlasowy.uzupelnijDziennikKlasowy(uczen2, oceny);

        dziennikKlasowy.sredniaOcenUczniow();
    }
}
