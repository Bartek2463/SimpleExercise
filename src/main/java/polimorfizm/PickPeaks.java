package polimorfizm;

import java.util.*;
import java.util.stream.Collectors;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[]arr){

        Map<String,List<Integer>> ans = new HashMap<String,List<Integer>>() {{
            put("pos",   new ArrayList<Integer>() );
            put("peaks", new ArrayList<Integer>() );
        }};
        int posMax = 0;
        boolean matchAsc = false;

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i-1] < arr[i]) {
                matchAsc = true;
                posMax = i;
            }
            if (matchAsc && arr[i-1] > arr[i]) {
                matchAsc = false;
                ans.get("pos").add(posMax);
                ans.get("peaks").add(arr[posMax]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{1, 4, 5, 4, 6,8,4,10,2}));
    }

}
