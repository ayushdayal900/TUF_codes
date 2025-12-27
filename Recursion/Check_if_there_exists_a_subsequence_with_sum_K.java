package Recursion;


/*


Problem Statement: Given an array nums and an integer k. Return true if there exist subsequences such that the sum of all elements in subsequences is equal to k else false.

Examples
Example 1:
Input :
 nums = [1, 2, 3, 4, 5] , k = 8
Output :
 Yes
Explanation :
 The subsequences like [1, 2, 5] , [1, 3, 4] , [3, 5] sum up to 8.

Example 2:
Input :
 nums = [4, 3, 9, 2] , k = 10
Output :
 No
Explanation :
 No subsequence can sum up to 10.





*/



public class Check_if_there_exists_a_subsequence_with_sum_K {

    public static boolean backtrack(int indx, int[] nums, int currSum, int sum){

        // base case
        if(indx == nums.length){
            return currSum == sum? true: false;
        }

        // take this arry
        boolean include = backtrack(indx+1, nums, currSum + nums[indx], sum);

        // exclude this array
        boolean exclude = backtrack(indx+1, nums, currSum, sum);

        return include || exclude;

    }


    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
        int sum = 80;

        boolean ans = backtrack(0, nums, 0, sum);
        System.out.println(ans);

    }
}
