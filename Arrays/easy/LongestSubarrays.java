package easy;

import java.util.HashMap;

/*
 * Problem Statement: Given an array and a sum k, we need to print the 
 * length of the longest subarray that sums to k.

Examples

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

 */



public class LongestSubarrays {


    public static void main(String[] args) {

        // // BRUTE FORCE METHOD-------------O(n^3)
        // int nums[] = {2,3,5,2,2,2,5,1};
        // int target = 6;
        // int ans = -1;

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i; j<nums.length; j++){
        //         int sum = 0;
        //         int c = 0;
        //         for(int k=i; k<=j; k++){
        //             sum +=nums[k];
        //             c++;
        //             // System.out.print(nums[k]+" "+": "+sum+"_"+c);
        //             if(sum == target && c>ans){
        //                 ans = c;
        //             }
        //         }
        //         // System.out.println();

        //     }
        // }
        // System.out.println(ans);



        // More good METHOD-------------O(n^2)
        // int nums[] = {2,3,5,2,2,2,5,1};
        // int nums[] = {2,3,5,2,2,1};
        // int target = 5;
        // int ans = -1;

        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     int c = 0;
        //     for(int j=i; j<nums.length; j++){                
        //         c++;
        //         sum+=nums[j];
        //         if(sum == target && c>ans){
        //             ans = c;
        //         }
        //     }
        // }
        // System.out.println(ans);










        // more better approach---------for +ve, -ve
        // int nums[] = {2,3,5,2,2,2,5,1};
        // int nums[] = {2,3,5,2,2,1,1,1,0,0,0,1,1};
        // int target = 5;
        // int sum = 0;
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // int ans = 0;
        // for(int i=0;i<nums.length; i++){
        //     sum +=nums[i];
            

        //     if(sum == target){
        //         ans = Math.max(ans,i+1);
        //     }

        //     int rem = sum - target;
        //     if(hm.containsKey(rem)){
        //         int len = i - hm.get(rem);
        //         ans = Math.max(ans,len);
        //     }

        //     if(!hm.containsKey(rem)){
        //         hm.put(sum,i);
        //     }

        // }

        // System.out.println(ans);



        // more better approach ------------ for +ve and 0
        // ---------------------------O(2n)
        // int nums[] = {2,3,5,2,2,1,1,1,0,0,0,1,1};
        int nums[] = {2,3,5,2,2,2,5,1};
        int target = 6;
        int sum = 0;

        int si = 0;
        int ei = 0;

        int ans = -1;
        while(si<nums.length && ei<nums.length){
            sum += nums[ei];

            if(sum==target){
                ans = Math.max(ans,ei-si+1);
            }

            // overall tc = O(n)
            while(sum>target){
                sum -=nums[si];
                si++;
            }
            System.out.println(sum);
            ei++;
        }
        System.out.println();
        System.out.println(ans);


    }
}
