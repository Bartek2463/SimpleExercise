package exercise;
import java.util.stream.IntStream;

public class Solution extends PangramChecker {
    public Solution(Integer sideLength) {
        super(sideLength);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int tab[] = new int[]{};


        for(int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                  tab = new int[]{i,j};
                }
            }
        }
      return IntStream.empty().toArray();
    }

    public static void main(String[] args) {
        Square square = new Square(10);
        Square square1 = new PangramChecker(22);
        Square square2 = new Square(23);
        PangramChecker pangramChecker1 = new PangramChecker(16);
        PangramChecker pangramChecker = new Solution(22);
        Solution solution = new Solution(33);
          Wekend wekend =Wekend.SUNDAY;
        System.out.println(wekend);

    }

}
