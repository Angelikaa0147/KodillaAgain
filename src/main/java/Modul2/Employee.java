package Modul2;

/**
 * Created by &[User] and &[Date].
 */
public class Employee {
    String firstName;
    String lastName;
    String peselID;

    //konstruktor
    public Employee(String firstName, String lastName, String peselID){
        this.firstName=firstName;
        this.lastName=lastName;
        this.peselID=peselID;
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return this.firstName==e.firstName && this.lastName==e.lastName && this.peselID==e.peselID;
    }

    //nadpisuję metodę hashcode pierwszy raz stąd podzielę wszustkich praconików do kubelków po dacie urodzenia:

    @Override
    public int hashCode(){
        return Integer.parseInt(peselID.substring(0,5));
    }
    @Override
    public String toString(){
        return peselID+", " +firstName + " " + lastName + ".";
    }

}
