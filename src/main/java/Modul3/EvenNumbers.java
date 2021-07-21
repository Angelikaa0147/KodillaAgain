package Modul3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class EvenNumbers {

    private ArrayList<Integer> randomNumbers = new ArrayList<>();

    public EvenNumbers(int number){
        Random generator = new Random();
        //losujemy 30 liczb z przedziału od 0 do number
        for(int i=0;i<30;i++){
            randomNumbers.add(generator.nextInt(number+1));
        }
    }

    //getter
    public ArrayList<Integer> getRandomNumbers(){
        return randomNumbers;
    }

    public void showOnlyEvenNumbers(){
        for(int i : randomNumbers){
            if(i%2==0){
                System.out.print(i + ",");
            }

        }
        System.out.println(" KONIEC");
    }

    public void showAllNumbers(){
        for(int i : randomNumbers){
            System.out.print(i + ", ");
        }
        System.out.println(" KONIEC");
    }



}
