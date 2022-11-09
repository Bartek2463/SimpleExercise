package exception;

import java.time.DateTimeException;
import java.time.LocalDate;

public class AppExc {
    public static void main(String[] args) {
        Person person = new Person();
        person.toString();
    }

    public Person addPerson(Person person)throws DateTimeException{

        person.setBirthDay(LocalDate.of(2,4,2025));
        person.setName("Rambo");
        System.out.println(person);
        return person;
    }
}
