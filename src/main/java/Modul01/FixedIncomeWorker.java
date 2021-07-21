package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class FixedIncomeWorker implements Employee{

    private double salary;
    private String id;


    public FixedIncomeWorker(double salary, String id){
        this.salary=salary;
        this.id=id;
    }

    @Override
    public double calculareSalary() {
        return this.salary*1.25;
    }

    public String getId() {
        return id;
    }
}
