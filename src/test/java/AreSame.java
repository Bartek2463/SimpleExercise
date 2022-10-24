import java.util.List;
import java.util.stream.IntStream;

public class AreSame {

    public static void main(String[] args) {
        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }


    public static boolean comp(int[] a, int[] b) {
        boolean isnull = false;
        if (a == null || a == null) {
            return isnull;
        } else {
            List<Integer> listA = IntStream.of(a).boxed().map(i -> i * i).sorted().toList();
            List<Integer> listB = IntStream.of(b).boxed().sorted().toList();
            return listA.equals(listB);
        }
    }
}
