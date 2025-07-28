package medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
        
        int[] nums = {7,1,5,3,6,4};
        // int[] nums = {7,6,4,3,1};
        // int ans = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         ans = Math.max(ans, nums[j]-nums[i]);
        //     }
        // }
        // System.out.println(ans);

        int ans = 0;
        int min = nums[0];

        for(int i=1; i<nums.length; i++){
            int cost = nums[i] - min;
            ans = Math.max(ans,cost);
            min = Math.min(min,nums[i]);
        }
        System.out.println(ans);
    }
}
