/*
Problem Statement: You are given an array 'arr' of size 'n' which denotes the position of stalls. You are also given an integer 'k' which denotes the number of aggressive cows.
You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible. Find the maximum possible minimum distance.

Example 1:
Input Format:
 N = 6, k = 4, arr[] = {0,3,4,7,10,9}

Result:3
Explanation:
 The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}. Here the distances between cows are 3, 4, and 3 respectively. We cannot make the minimum distance greater than 3 in any ways.

Example 2:
Input Format:
 N = 5, k = 2, arr[] = {4,2,1,3,6}

Result:5
Explanation:
 The maximum possible minimum distance between any two cows will be 5 when 2 cows are placed at positions {1, 6}. 


*/

import java.util.Arrays;

public class Aggressive_Cows {

    public static boolean canPlace(int[] stalls, int cows, int d){
        int count = 1;
        int lastPos = stalls[0];

        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-lastPos>=d){
                count++;
                lastPos = stalls[i];
            }
        }
        return count >= cows? true:false;
    }

    public static void main(String[] args) {
        
        int[] stalls = {0,3,4,7,10,9};
        int cows = 4;
        // int[] stalls = {4,2,1,3,6};
        // int cows = 2;

        Arrays.sort(stalls);


        // -------------------- m1
        // int maxDist = stalls[stalls.length - 1];
        // int ans = 0;

        // for(int d = 1; d<maxDist; d++){
        //     if(canPlace(stalls, cows, d)){
        //         ans = d;
        //     }
        // }


        // ------------------- m2
        int si = 1;
        int ei = stalls[stalls.length - 1];
        int ans = 0;

        while(si<=ei){
            int mid = si + (ei - si)/2;

            if(canPlace(stalls, cows, mid)){
                ans = mid;
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
