public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(2300, 160, 5));
    }

    public static String rgb(int r, int g, int b) {
       return String.format("%02X%02X%02X",verify(r),verify(g),verify(b));
    }
    private static  int verify(int i){
        return i > 0 ? Math.min(255,i) : 0;
    }

}
