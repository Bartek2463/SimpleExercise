package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
 * Do obliczenia pierwiastka
 * możesz użyć istniejącej metody java.lang.Math.sqrt().
 * Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
 * Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
 * <p>
 * Zachęcam do samodzielnego rozwiązania zadania, jeśli rozwiązujesz zadanie samodzielnie
 * uczysz się najwięcej. Jeśli jednak chciałbyś zobaczyć przykładowe rozwiązanie,
 * to umieściłem je na githubie.
 */

public class StackTraceExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Integer integer = scanner.nextInt();
            sqrt(integer);
      }catch (InputMismatchException e){
          e.printStackTrace();
      }


    }

    public static double sqrt(int number) {

        if (number <= 0) {
            throw new IllegalArgumentException("The number should by positive");
        }
        double sqrt = Math.sqrt(number);
        System.out.println(sqrt);
        return sqrt;
    }
}