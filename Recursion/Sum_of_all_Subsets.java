package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

/*

Subset Sum : Sum of all Subsets



0

Problem Statement: Given an array print all the sum of the subset generated from it, in the increasing order.

Examples

Input: N = 3, arr[] = {5,2,1}
Output: 0,1,2,3,5,6,7,8
Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8

Input: N=3,arr[]= {3,1,2}
Output: 0,1,2,3,3,4,5,6
Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets are [ [], [1], [2], [2,1], [3], [3,1], [3,2]. [3,2,1],so the sums we get will be  0,1,2,3,3,4,5,6


*/


public class Sum_of_all_Subsets {

    public static void backtrack(int indx, int[]nums, int currSum, ArrayList<Integer> sums){

        // base case 
        if(indx == nums.length){
            sums.add(currSum);
            return;
        }

        // include
        backtrack(indx+1, nums, currSum + nums[indx], sums);

        // exclude
        backtrack(indx+1, nums, currSum, sums);
    }

    public static void main(String[] args) {
        
        int[] nums = {5,2,1};

        ArrayList<Integer> sums = new ArrayList<>();
        int indx = 0;
        int currSum = 0;

        backtrack(indx, nums, currSum, sums);

        for(int i: sums){
            System.out.print(i + " ");
        }
    }
}
