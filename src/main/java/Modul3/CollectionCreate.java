package Modul3;

import java.util.ArrayList;

/**
 * Created by &[User] and &[Date].
 */
public class CollectionCreate {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<3000000;i++){
            list.add(i);
        }

        System.out.println(list.size());

        //deleting last element from ArrayList collection

        long start= System.nanoTime();
        list.remove(list.size()-1);
        long end=System.nanoTime();

        System.out.println("Czas usunięcia ostatniego elementu z ArrayListy wynosi " + (end-start));

        start= System.nanoTime();
        list.remove(0);
        end=System.nanoTime();

        System.out.println("Czas usunięcia pierwszego elementu z ArrayListy wynosi " + (end-start));

    }

}
