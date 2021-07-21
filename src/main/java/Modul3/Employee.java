package Modul3;

import java.time.LocalDate;

/**
 * Created by &[User] and &[Date].
 */
public class Employee {

    private String firstName;
    private String lastName;
    LocalDate birthDate;

    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    //wlasnoręcznie napisana metoda hashCode

    @Override
    public int hashCode(){
        return birthDate.getYear()*10000+birthDate.getMonthValue()*100+birthDate.getDayOfMonth();
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee)o;
        return this.firstName==e.firstName &&
                this.lastName==e.lastName &&
                this.birthDate.getYear()==e.birthDate.getYear() &&
                this.birthDate.getMonthValue()== e.birthDate.getMonthValue() &&
                this.birthDate.getDayOfMonth()==e.birthDate.getDayOfMonth();
    }

    @Override
    public String toString(){
        return "Employee " + firstName + " " + lastName+ ", id: " + hashCode();
    }

}
