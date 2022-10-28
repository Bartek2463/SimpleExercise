import java.io.UncheckedIOException;
package tuperele;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Maps {
    public static void main(String[] args) {
        map(new int[]{1,34,3,6});
    }


    public static int[] map(int[] arr) {

        int[] ints = Arrays.stream(arr).max().stream().toArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        return ints;
    }
}
