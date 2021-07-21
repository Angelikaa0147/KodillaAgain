package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class Knight {
    private Quest quest;
    //konstruktor
    public Knight (Quest quest){
        this.quest=quest;
    }

    public void wakeUpTheKnight(){
        quest.process();
    }

}
