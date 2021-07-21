package Modul4;

/**
 * Created by &[User] and &[Date].
 */
public class Cannon {

    public boolean loaded;



    public void fire(){
        if(loaded){
            System.out.println("Cannon is loaded");

        }else {
            System.out.println("Cannon is NOT loaded, wait a moment I try Again");
            loaded=true;
            fire();
        }
    }

}
