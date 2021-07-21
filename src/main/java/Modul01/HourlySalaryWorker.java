package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class HourlySalaryWorker implements Employee {
    private double hoursPay;
    private double hours;
    private String id;


    public HourlySalaryWorker(double hoursPay,double hours, String id){
        this.hoursPay=hoursPay;
        this.hours=hours;
        this.id=id;
    }

    @Override
    public double calculareSalary() {
        return this.hoursPay*hours;
    }

    public String getId() {
        return id;
    }
}
