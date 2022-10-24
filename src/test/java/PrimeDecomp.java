public class PrimeDecomp {

    public static void main(String[] args) {
        factors(7789567);
    }

    public static String factors(int input) {
        String result = "";
        int count;
        for (int i = 2; i <= input; i++) {


            for (count = 0; input % i == 0; count++) {
                input /= i;
            }
            if (count > 0) {
                result += "(" + i + (count > 1 ? "**" + count : "") + ")";
            }
            System.out.println(result);
        }
        return result;
    }
}
