package Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // [0,n]
        int sum = 0;
        for(int i:nums){
            sum +=i;
        }
        return (int)(n*(n+1))/2 - sum;
    }


    public static void main(String[] args) {
        // int[] nums = {0,2,3,1,4};
        int[] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumber(nums));
    }
}
