package other;

import java.util.Arrays;

public class ExampleTwist {

    public static void main(String[] args) {
        kataExampleTest( "codewars");
    }

    public static  String[] kataExampleTest(String input){
        String[] websides = new String[1000];
        Arrays.fill(websides,input);
        for (int i=0;i<=1000-1;i++){
            System.out.println(websides[i]);
        }
        return websides;
    }
}
