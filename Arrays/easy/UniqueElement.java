package Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        
        // brute force method
        // hashmap method


        int[] nums = {4,1,2,1,2};
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            ans ^=nums[i];
        }
        System.out.println(ans);


    }
}
