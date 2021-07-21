package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public interface ATM2 {

    void wplata();

    void wyplata();

    default void polaczenieZBankiem(){
        System.out.println("POMYSLNIE NAWIAZANO POLACZENIE Z BANKIEM");
    }

    static void informacjaOZakonczeniuPolaczenia(){
        System.out.println("POLACZENIE Z BANKIEM ZOSTALO ZAKONCZONE");
    }

}
