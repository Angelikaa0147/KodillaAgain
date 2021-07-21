package Modul3;

import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class MyObcjet {
    private int value;

    public MyObcjet(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //nadpisujemy metodę equals:
    @Override
    public boolean equals(Object o){
        MyObcjet m = (MyObcjet) o ;
        return this.getValue()==m.getValue();
    }


}
