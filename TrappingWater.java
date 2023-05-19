public class TrappingWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};  
        System.out.println(trap(height));  
    }

    static int trap(int[] height){

        int maxi = 0;
        int waterstored = 0;

        for(int i = 0; i < height.length-2; i++){
            int left = 0, right = 0;
            for(int j = i; j >= 0; j--){
                if(height[j] > left){
                    left = height[j];
                }
            }

            System.out.println(left + " left");

            for(int j = i+1; j < height.length-2; j++){
                if(height[j] > right){
                    right = height[j];
                }
            }

            System.out.println(right + " right");
            System.out.println();

            if(height[i] == Math.max(left, right)){
                maxi = Math.max(left, right);
                waterstored += Math.abs(height[i] - maxi);
            }
            else{
            maxi = Math.min(left, right);
            waterstored += Math.abs(height[i] - maxi);
            }
            
        }

        return waterstored;
    }
}
