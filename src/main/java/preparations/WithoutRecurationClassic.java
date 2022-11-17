package preparations;

public class WithoutRecurationClassic {
    public static int withoutRecuration(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * withoutRecuration(number-1);
        }
    }

}