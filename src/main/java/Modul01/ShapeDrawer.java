package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class ShapeDrawer {

    private Shape shape;

    //konstruktor
    public ShapeDrawer(Shape shape){
        this.shape=shape;
    }

    //metoda process

    public void process(){
        this.shape.draw();
        System.out.println(Shape.getSomeRodoInformation());

    }

    Shape getShape(){
        return this.shape;
    }






}
