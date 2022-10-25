package exceptions;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws InvalidBirthdayDate {

        Person rambo = new Person();
        rambo.setName("Rambo");
        rambo.setBirthday(LocalDate.of(2025, 10, 10));

        System.out.println(rambo);

    }
}
