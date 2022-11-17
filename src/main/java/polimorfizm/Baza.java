package polimorfizm;

import java.util.stream.IntStream;

public class Baza {
    public static int withouttRcurat(int number) {

        int previouselement = 0;
        int currentelement = 1;
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result = previouselement + currentelement;
            previouselement = currentelement;
            currentelement = result;
        }
        return result;

    }

    public static void main(String[] args) {
        withouttRcurat(6);
    }

}
