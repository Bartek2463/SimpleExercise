package preparations;

public class ReverseString {

    public static String reverse(String s){
        char[] chars = s.toCharArray();
        char[] charactersReversed = new char[chars.length];
        int startIndex = 0;
        for (int i=chars.length-1; i>=0; i--){
            charactersReversed[startIndex] = chars[i];
            startIndex++;
        }
        s = String.valueOf(charactersReversed);
        return s;
    }
}

