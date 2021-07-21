package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class ATMimplementation implements ATM2 {


    @Override
    public void wplata() {
        System.out.println("WYPLACONO Z BANKOMATU");
    }

    @Override
    public void wyplata() {
        System.out.println("WPLACONO NA KONTO");
    }
}
