import java.util.Arrays;

public class TwoPointerOptimal {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int[] ans = twoSum(nums, 6);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int i = 0;
        int low = i;
        int high = nums.length-1;

        while(low < high){
            if(nums[low] + nums[high] == target){
                int[] ans = {low, high};
                return ans;
            }
            else if(nums[low] + nums[high] > target){
                high--;
            }
            else{
                low++;
            }
        }

        int[] ans = {-1, -1};

        return ans;
    }
}
