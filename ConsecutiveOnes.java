public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 1, 0, 0, 1, 1, 0, 0};
        System.out.println(findMaxConsecutiveOnes(arr1));
    }

    static int findMaxConsecutiveOnes(int[] nums){
        int cnt = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                cnt++;
                max = Math.max(cnt, max);
            }
            else{
                cnt = 0;
            }
        }

        return max;

    }
}
