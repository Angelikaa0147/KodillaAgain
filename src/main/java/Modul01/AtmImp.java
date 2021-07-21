package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class AtmImp implements ATM{

    @Override
    public boolean payment(double amount) {
        if(amount>0){
            System.out.println("A payment has been made for the amount of " + amount);
            return true;
        }else return false;
    }

    @Override
    public boolean withdrawal(double amount) {
        if(amount>0){
            System.out.println("A withdrawl has been made for the amount of " + amount);
            return true;
        }else return false;
    }
}
