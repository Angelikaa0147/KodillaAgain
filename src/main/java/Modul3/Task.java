package Modul3;

import java.time.LocalDate;

/**
 * Created by &[User] and &[Date].
 */
public class Task {
    private String descrpition;
    private LocalDate deadline;

    public Task(String descrpition, int year, int month, int day) {
        this.descrpition = descrpition;
        this.deadline = LocalDate.of(year,month,day);
    }

    public String getDescrpition() {
        return descrpition;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString(){
        return descrpition;
    }



}
