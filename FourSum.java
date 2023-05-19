import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        System.out.println(fourSum(arr, 9));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lst = new LinkedList<>();
        int res = 0;
        int newTarget = 0;

        if(nums.length == 0){
            return lst;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                res = (nums[i] + nums[j]);
                newTarget = target - res;

                int low = j+1;
                int high = nums.length - 1;

                while(low < high){
                    if((nums[low] + nums[high]) > newTarget){
                        high--;
                    }

                    else if((nums[low] + nums[high]) < newTarget){
                        low++;
                    }

                    else{
                        List<Integer> sumNo = new ArrayList<>();
                        sumNo.add(nums[i]);
                        sumNo.add(nums[j]);
                        sumNo.add(nums[low]);
                        sumNo.add(nums[high]);

                        lst.add(sumNo);

                        while(low < high && nums[low] == sumNo.get(2)){
                            low++;
                        }

                        while(low < high && nums[high] == sumNo.get(3)){
                            high--;
                        }
                    }
                }
                while(j+1 < nums.length && nums[j+1] == nums[j]){
                    ++j;
                }
            }
            while(i+1 < nums.length && nums[i+1] == nums[i]){
                ++i;
            }
        }

        return lst;

    }

}
