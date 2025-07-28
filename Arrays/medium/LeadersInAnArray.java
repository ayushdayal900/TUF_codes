package medium;

import java.util.ArrayList;

// Problem Statement: Given an array, print all the elements which
//  are leaders. A Leader is an element that is greater than all of 
// the elements on its right side in the array.


public class LeadersInAnArray {
   public static void main(String[] args) {
    
    int[] nums = {4,7,1,0};
    ArrayList<Integer> al = new ArrayList<>();


    // Brute force method - O(n^2)


    // for(int i=0; i<nums.length; i++){
    //     boolean gr = true;
    //     for(int j=i+1; j<nums.length; j++){
    //         if(nums[i]<nums[j]){
    //             gr = false;
    //         }
    //     }
    //     if(gr){
    //         al.add(nums[i]);
    //     }
    // }

    int max = Integer.MIN_VALUE;

    for(int i=nums.length - 1; i>=0; i--){
        if(max<nums[i]){
            max = nums[i];
            al.add(nums[i]);
        }
    }

    for(int i : al){
        System.out.println(i);
    }




   } 
}
