package polimorfizm;

public class Baza {
    public static int withouttRcurat(int number){
        int result = 1;

        if (number<0){
            throw  new IllegalArgumentException();
        }
        while (number>1){
            result*=number;
            number--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(withouttRcurat(3));
    }

}
