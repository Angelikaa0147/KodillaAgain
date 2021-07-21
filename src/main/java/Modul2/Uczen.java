package Modul2;

/**
 * Created by &[User] and &[Date].
 */
public class Uczen {

        private String name;
        private int id;

    public Uczen(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode(){
        return id*31+151;
    }

    @Override
    public boolean equals(Object o){
        Uczen u = (Uczen) o;
        return this.name==u.name && this.id==u.id;
    }

    @Override
    public String toString(){
        return "Uczeń : " + name + " o id : " + id;
    }
}
