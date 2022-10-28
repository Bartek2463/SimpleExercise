package exceptions;

public class Exception {

    static  void checkAge(int age){
        if(age<18){
            throw  new ArithmeticException("You are so young");
        }else {
            System.out.println("You are old");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
