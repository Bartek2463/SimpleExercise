package exercise;

public class HumanReadableTime {

    public static void main(String[] args) {

        System.out.println(makeReadable(7201));
    }

   public static String makeReadable(int seconds){
        return String.format("%02d:%02d:%02d",seconds/3600,seconds%3600/60,seconds%60);
   }
}
