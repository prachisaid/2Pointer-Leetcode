import java.util.Arrays;
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBrute{
    public static void main(String[] args){
        // Set<Integer> hash_set = new HashSet<Integer>();

        int[][] arr = {{1, 2, 3},
                     {4, 5, 6},
                     {1, 2, 3}};
        Set<List<Integer>> set = new LinkedHashSet<>();

        set.add(Arrays.asList(arr[0][0], arr[0][1], arr[0][2]));
        set.add(Arrays.asList(arr[1][0], arr[1][1], arr[1][2]));
        set.add(Arrays.asList(arr[2][0], arr[2][1], arr[2][2]));
        System.out.println(set);
    }
}