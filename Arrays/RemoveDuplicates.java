package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,2,3,3};




        // BRUTE FORCE METHOD
        /*
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i: nums){
            if(!ans.contains(i)){
                ans.add(i);
            }
        } 

        
        for(int i : ans){
            System.out.println(i);
        }

        */


        // ------------------------------------------------------------------
        
        // HASHSET
        /*
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
            }
            
            for(int i : hs){
            System.out.println(i);
            }
            */
            
        // -----------------------------------------------------------------------

        // 2 Pointer Method
        int i=0;
        int c = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i = j;
                c++;
            }
        }
        System.out.println("Unique Elements : "+(c+1));
    }
}
