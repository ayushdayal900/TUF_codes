public class Single_Element_in_a_Sorted_Array {
        public static int singleNonDuplicate(int[] nums) {
        
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            ans ^= nums[i];
        }

        return ans;

    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
