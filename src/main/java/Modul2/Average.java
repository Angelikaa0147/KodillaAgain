package Modul2;

/**
 * Created by &[User] and &[Date].
 */
public class Average {

    private int number;
    private int[] tablicaNumbers = new int[20];
    public Average(int number) {
        this.number = number;

        for (int i=0;i<20;i++){

            number++;

            tablicaNumbers[i]=number;
        }

    }

    public double calculateAverage(){
        double average =0;
        for(int i : tablicaNumbers){
            average+=i;
        }
        System.out.println("this is the average " +  average/number);
        return average/number;

    }



    public void showNumbers(){
        System.out.println("tablica numbers....");
        for(int i: tablicaNumbers){
            System.out.print("["+i+"] " );
        }
    }





}
