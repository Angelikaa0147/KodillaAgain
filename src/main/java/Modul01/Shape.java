package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public interface Shape {

    void draw();

    default void someDefaultMethod(){
        System.out.println("This is some default method from Shape interface ....");
    }

    static String getSomeRodoInformation(){
        return "This is the RODO information for every shape so the method can be static and does not depend on " +
                "chosen shape...";
    }

}
