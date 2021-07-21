package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public abstract class SalaryPayout {

    private Employee employee;


    //konstruktor
    public SalaryPayout (Employee employee){
        this.employee=employee;
    }

    //metody do zaimplementowania w klasie process
    protected abstract void payout();

    protected void process(){
        System.out.println("CREATING PAYOUT FOR " + employee.getId() + "\nAMOUNT : " + employee.calculareSalary() );
    }

}
