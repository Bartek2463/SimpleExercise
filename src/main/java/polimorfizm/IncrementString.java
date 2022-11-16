package polimorfizm;

import java.math.BigInteger;

public class IncrementString {

    public static String invrement(String input){

            String u = java.util.regex.Pattern.compile("(\\d+)$").matcher(input).replaceAll(x -> String.format("%0" + x.group().length() +"d", new BigInteger(x.group()).add(BigInteger.ONE)));
            return u.matches(".*(?<!\\d)")?u+1:u;
    }


    public static void main(String[] args) {
invrement("kata12");
    }
}
