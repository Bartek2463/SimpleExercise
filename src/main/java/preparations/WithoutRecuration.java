package preparations;

import java.util.stream.IntStream;

public class WithoutRecuration {
    public  static  int withoutRecuration(int n){
        if (n<0){
            throw new IllegalArgumentException("Number should be positive");
        }
        return IntStream.rangeClosed(1,n)
                .reduce((left, right) -> (right*left))
                .orElse(1);
    }

    public static void main(String[] args) {
//       System.out.println(withoutRecuration(10));
//        System.out.println(WithoutRecurationClassic.withoutRecuration(6));
//        System.out.println(Fibonacci.getFiboSum(34));
        System.out.println(ReverseString.reverse("Ala"));
    }
}
