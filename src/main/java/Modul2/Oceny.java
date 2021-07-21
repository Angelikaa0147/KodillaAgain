package Modul2;

import java.util.ArrayList;

/**
 * Created by &[User] and &[Date].
 */
public class Oceny {

    private ArrayList<Integer> dziennik = new ArrayList<>();

    public void uzupelnijDziennik(int ocena){
        dziennik.add(ocena);
    }

    public ArrayList<Integer> getDziennik(){
        return dziennik;
    }

    public double sredniaOcen(){
        double srednia=0;
        for (int i : dziennik){
            srednia+=i;
        }
        return srednia/dziennik.size();
    }


}
