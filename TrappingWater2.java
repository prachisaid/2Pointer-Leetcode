public class TrappingWater2 {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};  
        System.out.println(trap(height));
    }

    static int trap(int[] height){
        int n = height.length;
        int l = 0, r = n-1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while(l <= r){
            if(height[l] <= height[r]){
                if(height[l] >= leftMax){
                    leftMax = height[l];
                }
                else{
                    res += leftMax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rightMax){
                    rightMax = height[r];
                }
                else{
                    res += rightMax - height[r];
                }
                r--;
            }
        }

        return res;
    }
}
