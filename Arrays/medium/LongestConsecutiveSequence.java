package medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {


    // Brute force method
    // public static boolean hasNext(int a, int[] nums){
    //     boolean ans = false;
    //     for(int i:nums){
    //         if(i==a){
    //             ans = true;
    //         }
    //     }
    //     return ans;
    // }
    // public static int cons(int[] nums){

    //     int len=0;
    //     for(int i: nums){

    //         int x = i;
    //         int longest = 1;

    //         while(hasNext(x+1,nums)){
    //             x++;
    //             longest++;
    //         }
    //         len = Math.max(longest, len);
    //         longest = 0;

    //     }
    //     return len;
    // }




    // m2
    // public static int cons(int[] a){
    //     int lastSmaller = Integer.MIN_VALUE;
    //     int len = 0;
    //     int ans = 0;
        
    //     Arrays.sort(a);
    //     for(int i: a){
    //         if(i-1 == lastSmaller){
    //             lastSmaller = i;
    //             len++;
    //         }else if(i != lastSmaller){
    //             lastSmaller = i;
    //             len = 1;
    //         }
    //         ans = Math.max(len, ans);
    //     }

    //     return ans;
    // }

    public static int cons(int[] a){

        HashSet<Integer> hs = new HashSet<>();
        for(int i: a){
            hs.add(i);
        }

        int start = -1;
        int len = 0; 
        int longest =0;   

        for(int i: hs){
            if(!hs.contains(i-1)){  // i is 1st element to start from
                start = i;
                len = 1;
                while(hs.contains(start+1)){
                    start++;
                    len++;
                }
                longest = Math.max(len, longest);
            }
        }



        return longest;
    }






    public static void main(String[] args) {
        int[] nums = {3,5,7,6,1,2,4,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println(cons(nums));
    }
}
