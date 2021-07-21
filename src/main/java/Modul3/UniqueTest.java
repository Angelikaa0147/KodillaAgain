package Modul3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class UniqueTest {

    public static void main(String[] args) {
        LinkedList<MyObcjet> linkedList=new LinkedList<>();
        HashSet<MyObcjet> uniqueList = new HashSet<>();
        Random generator = new Random();
        for(int i=0;i<20;i++){
            linkedList.add(new MyObcjet(generator.nextInt(10)));
        }

        System.out.println("wygenerowana lista: ");

        for(MyObcjet m: linkedList){
            System.out.print(m.getValue() + ", ");
        }

        //wypisanie duplikatów
        Iterator<MyObcjet> iterator = linkedList.iterator();
        System.out.println("\nDUPLIKATY:");
        while (iterator.hasNext()){
            MyObcjet temp = iterator.next();
            for(int k=0;k<linkedList.size();k++){
                if(temp.hashCode()!=linkedList.get(k).hashCode()){
                    if(temp.equals(linkedList.get(k))){
                       uniqueList.add(temp);
                    }
                }

            }
        }

        for(MyObcjet m : uniqueList){
            System.out.print( m.getValue() + ", ");
        }

        MyObcjet myObcjet1=new MyObcjet(3);
        System.out.println("\nhashcode "  +  myObcjet1.hashCode());

        MyObcjet myObcjet2=new MyObcjet(3);
        System.out.println("hashcode "  +  myObcjet2.hashCode());
        System.out.println(myObcjet1.equals(myObcjet2));


    }

}
