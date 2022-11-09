package exercise;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {

        System.out.println(pangram(new int[]{1, 3, 4, 5, 2, 10, 1035}, 123));

    }

    public static int[] pangram(int[]ints,int sum ){
        int tablica[]= new int[2];
        for (int i = 0;i<ints.length;i++){
            for (int j = 0;j<ints.length;j++){
                if (ints[i]+ints[j]==sum){
                     tablica[0]=i;
                     tablica[1]=j;
                    return tablica;
                }
            }
        }
        return ints;
    }
}
