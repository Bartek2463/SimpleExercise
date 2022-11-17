package other;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven("ultr53o?n"));
    }
    public static String isEven(String n){
        return new StringBuilder(n.replaceAll("[^A-Za-z]","")).reverse().toString();
    }
}
