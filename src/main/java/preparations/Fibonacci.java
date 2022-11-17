package preparations;

public class Fibonacci {

    public static int getFiboSum(int value){

        if (value<0){
            throw new IllegalArgumentException();
        }
        if (value<=1){
            return value;
        }
        int previousElement = 0;
        int currentElement = 1;
        int result = 1;
        for(int i = 2;i<=value;i++){
            result = previousElement+currentElement;
            previousElement=currentElement;
            currentElement = result;
        }

        return result;
    }
}
