package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee){
        super(employee);
    }

    @Override
    protected void payout() {
        System.out.println("THIS IS THE PAYOUT FROM SALARY PAYOUT PROCESSOR...");

    }


}
