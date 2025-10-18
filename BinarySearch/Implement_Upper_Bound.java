// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.





/*
 
    Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 1
    Explanation: Index 1 is the smallest index such that arr[1] >= x.

    Example 2:
    Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
    Result: 3
    Explanation: Index 3 is the smallest index such that arr[3] >= x.

 */



package BinarySearch;

public class Implement_Upper_Bound {
    public static void main(String[] args) {
        
        // int[] arr = {1,2,2,3};
        int[] arr = {3,5,8,9,10,11,15,19,29};

        int x = 13;

        int si=0;
        int ei=arr.length-1; 
        int ans = -1;

        while(si<=ei){

            int mid = (si+ei)/2;

            if(arr[mid] >= x){
                ans = mid;
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }

        }

        System.out.println(ans);


    }
}
