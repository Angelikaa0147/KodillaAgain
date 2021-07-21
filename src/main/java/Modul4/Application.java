package Modul4;

import java.beans.IntrospectionException;
import java.util.*;

/**
 * Created by &[User] and &[Date].
 */
public class Application {

    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();

        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        StringBuilder stringBuilder = new StringBuilder();
        for(String s : companies){
            stringBuilder.append(s);
            stringBuilder.append(", ");
        }
        System.out.println(stringBuilder.toString().substring(0,stringBuilder.length()-2));


        Map<Integer,String> myFavoriteColors = new HashMap<>();
        Map<Integer,String> myFriendsFavoriteColors=new HashMap<>();
        myFavoriteColors.put(1,"Red");
        myFavoriteColors.put(2,"Green");
        myFavoriteColors.put(3,"Black");

        System.out.println("Values in first Map " + myFavoriteColors);

        myFriendsFavoriteColors.put(4,"White");
        myFriendsFavoriteColors.put(5,"Blue");
        myFriendsFavoriteColors.put(6,"Orange");
        System.out.println("Values in second Map " + myFriendsFavoriteColors);

        Map<Integer,String> ourFavouriteColors = new HashMap<>();
        for(Map.Entry<Integer,String> entry : myFavoriteColors.entrySet()){
            ourFavouriteColors.put(entry.getKey(),entry.getValue());
        }

        for(Map.Entry<Integer,String> entry : myFriendsFavoriteColors.entrySet()){
            ourFavouriteColors.put(entry.getKey(),entry.getValue());
        }

        System.out.println("Third Maps = " + ourFavouriteColors);


        LinkedList<Cannon> cannonStories = new LinkedList<>();
        Cannon cannon = new Cannon();
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();
        Cannon cannon5 = new Cannon();

        cannonStories.add(cannon);
        cannonStories.add(cannon1);
        cannonStories.add(cannon2);
        cannonStories.add(cannon3);
        cannonStories.add(cannon4);
        cannonStories.add(cannon5);


        for(Cannon c : cannonStories){
            c.loaded=true;
            c.fire();
        }

        System.out.println("SOME CHANGE HAS MADE....");
        System.out.println("SECOND CHANGE HAS MADE....");


    }






}
