package Modul3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by &[User] and &[Date].
 */
public class DivededTheLetterSnake {

    public ArrayList<String>[] divide (ArrayDeque<String> snakeQueue){
        ArrayList<String>[] tablica = new ArrayList[2];
        ArrayList<String> evenElements = new ArrayList<>();
        ArrayList<String> oddsElements = new ArrayList<>();
        tablica[0] =evenElements;
        tablica[1]=oddsElements;

        for(String s: snakeQueue){
            if(s.length()%2==0){
                evenElements.add(s);
            }else oddsElements.add(s);
        }
        return tablica;
    }

}
