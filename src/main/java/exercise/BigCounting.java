package exercise;

public class BigCounting {
    public static void main(String[] args) {
       countBits(30);
    }

    public static int countBits(int n) {
        int i = Integer.bitCount(n);
        System.out.println(i);


        return i;
    }

}
