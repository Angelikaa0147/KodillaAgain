package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class Cat implements Animal {

    private String nameOfAnimal;

    //konstruktor;
    public Cat(String nameOfAnimal){
        this.nameOfAnimal=nameOfAnimal;
    }

     public void getTypeOfAnimal(){
        System.out.println("THIS IS THE CAT");
    }

}
