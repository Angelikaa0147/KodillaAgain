package Modul3;

import java.util.ArrayDeque;
import java.util.Random;

/**
 * Created by &[User] and &[Date].
 */
public class CreateLetterSnake {


   public ArrayDeque<String> createQueue() {
       ArrayDeque<String> snake = new ArrayDeque<String>();
       int random = 0;
       Random generator = new Random();


       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < 50; i++) {
           random = generator.nextInt(10) + 1;
           for (int j = 0; j < random; j++) {
               sb.append('a');
           }
           snake.offer(sb.toString());
           sb.delete(0, random);
       }
       return snake;
   }

}
