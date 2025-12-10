public class Find_Minimum_in_Rotated_Sorted_Array {
     public static int findMin(int[] nums) {
        // ans will always be in right half

        int si = 0;
        int ei = nums.length - 1;

        while(si<ei){
            int mid = si + (ei - si)/2;

            if(nums[mid]>nums[ei]){
                si = mid + 1; 
            }else{
                ei = mid;
            }
        }

        return nums[si];
    }

    public static void main(String[] args) {

        int[] nums = {3,4,5,0,1,2};
        System.out.println(findMin(nums));
    }
}
