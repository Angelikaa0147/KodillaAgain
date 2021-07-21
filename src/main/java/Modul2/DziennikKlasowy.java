package Modul2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by &[User] and &[Date].
 */
public class DziennikKlasowy {

    private HashMap<Uczen, Oceny> dziennikKlasowy = new HashMap<>();

    public void uzupelnijDziennikKlasowy(Uczen uczen, Oceny oceny){
        dziennikKlasowy.put(uczen,oceny);
    }


    public void sredniaOcenUczniow(){
        for(Map.Entry<Uczen,Oceny> e : dziennikKlasowy.entrySet()){
            System.out.println(e.getKey().toString() + " ma średnią z ocen : = " + e.getValue().sredniaOcen() );
        }
    }


}
