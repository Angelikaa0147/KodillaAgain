package Modul01;

/**
 * Created by &[User] and &[Date].
 */
public class AnimalRecognizer {

    private Animal animal;

    //konstruktor
    public AnimalRecognizer(Animal animal){
        this.animal=animal;
    }

    public void recognizeTheAnimal(){
        animal.getTypeOfAnimal();
    }

}
