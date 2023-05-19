import java.util.*;

public class ThreeSumOptimal {
    public static void main(String[] args) {
        int nums[] = {-1, 2, 2, 0, 2, 0, -1, -2, -1, 0};

        List<List<Integer>> lst = new LinkedList<>();
        lst = ThreeSum(nums);
        System.out.println(lst);
    }

    static List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        
        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || (i > 0) && (nums[i] != nums[i-1])){
                int lo = i + 1, hi = nums.length-1, sum = 0 - nums[i];

                while(lo < hi){
                    if(nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while(lo < hi && nums[lo] == nums[lo+1]){
                            lo++;
                        }
                        while(lo < hi && nums[hi] == nums[hi-1]){
                            hi--;
                        }

                        lo++;
                        hi--;
                    }

                    else if(nums[lo] + nums[hi] < sum){
                        lo++;
                    }

                    else{
                        hi--;
                    }
                }
            }
        }
        return res;
    }

}
