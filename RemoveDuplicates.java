import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] nums){
        int n = nums.length;
        int l = 0, r = l+1;

        if(n == 0){
            return 0;
        }

        int cnt = 1;

        while (r < n) {
            if(nums[l] == nums[r]){
                r++;
            }
            else if(nums[l] != nums[r]){
                l++;

                // Instead of swapping we can also just assign nums[l] = nums[r] and then continue checking
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
                cnt++;
            }
        }

        return cnt;

    }


}
