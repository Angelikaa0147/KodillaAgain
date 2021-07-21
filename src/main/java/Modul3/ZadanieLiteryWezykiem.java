package Modul3;

import java.util.ArrayDeque;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class ZadanieLiteryWezykiem {
    public static void main(String[] args) {

        CreateLetterSnake createLetterSnake = new CreateLetterSnake();
        for(String s: createLetterSnake.createQueue()){
            System.out.println(s);
        }

        DivededTheLetterSnake divededTheLetterSnake = new DivededTheLetterSnake();
        divededTheLetterSnake.divide(createLetterSnake.createQueue());

        System.out.println("TABLICA NR 1");

        for(String i : divededTheLetterSnake.divide(createLetterSnake.createQueue())[0] ){
            System.out.println(i);
        }


    }
}
