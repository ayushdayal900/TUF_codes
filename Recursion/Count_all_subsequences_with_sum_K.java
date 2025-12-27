package Recursion;

import java.util.ArrayList;
import java.util.List;


/*

Problem Statement: Given an array nums and an integer k.Return the number of non-empty subsequences of nums such that the sum of all elements in the subsequence is equal to k.

Examples
Example 1:
Input :
 nums = [4, 9, 2, 5, 1] , k = 10
Output :
 2
Explanation :
 The possible subsets with sum k are [9, 1] , [4, 5, 1].

Example 2:
Input :
 nums = [4, 2, 10, 5, 1, 3] , k = 5
Output :
 3
Explanation :
 The possible subsets with sum k are [4, 1] , [2, 3] , [5].


*/


// 🧠 One-Line Memory Trick
// Subsequence problems = Take it or Leave it


public class Count_all_subsequences_with_sum_K {

    public static int total = 0;

    public static int backtrack(int indx, List<List<Integer>> result, int currSum, int[] nums, int sum){

        // base case
        if(indx == nums.length){
            return currSum == sum ? 1:0;
        }

        // include itself
        int inc = backtrack(indx+1, result, currSum + nums[indx], nums, sum);
        
        // exclude itself
        int exc = backtrack(indx+1, result, currSum, nums, sum);        

        return inc + exc;
    }

    public static void main(String[] args) {
        
        int[] nums = {4,9,2,5,1};
        int sum =  10;

        List<List<Integer>> result = new ArrayList<>();
        int curr = 0;
        int indx = 0;
        int c = backtrack(indx, result, curr, nums, sum);
        System.out.println(c);


    }
}
