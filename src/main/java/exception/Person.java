package exception;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public  void setBirthDay(LocalDate birthday){
        if(birthday.isAfter(LocalDate.now())){
            throw  new DateTimeException("The wrong date cannot be from the past");
        }
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
