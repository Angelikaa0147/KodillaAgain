package Modul2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by &[User] and &[Date].
 */
public class Grade {

    private ArrayList<Integer> grades=new ArrayList<>();

    public void addGrades(int grade){
        grades.add(grade);
    }

    public double average(){
        double average =0;
        for(int i : grades){
            average+=i;

        }
        return average/grades.size();
    }


    public double averageWithoutExtremeGrades(){
        Collections.sort(grades);
        double average =0;
        for(int i=1;i<grades.size()-1;i++){
            average+=grades.get(i);
        }
        return average/(grades.size()-2);
    }


}
