package Modul2;

/**
 * Created by &[User] and &[Date].
 */
public class SalaryPayments {
    double salary;
    double bonus;

    public SalaryPayments(double salary, double bonus){
        this.salary=salary;
        this.bonus=bonus;
    }

    @Override
    public String toString(){
        return salary + " plus extra bonus " + bonus;
    }

}
