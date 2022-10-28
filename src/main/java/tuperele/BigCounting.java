package tuperele;

import javax.swing.text.html.HTMLEditorKit;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

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
