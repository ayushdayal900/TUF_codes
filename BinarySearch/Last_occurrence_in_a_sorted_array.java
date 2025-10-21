package BinarySearch;

// Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1.

// Note: Consider 0 based indexing

// Examples:

// Example 1:
// Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
// Output: 4
// Explanation: As the target value is 13 , it appears for the first time at index number 2.

// Example 2:
// Input: N = 7, target=60, array[] = {3,4,13,13,13,20,40}
// Output: -1
// Explanation: Target value 60 is not present in the array 


public class Last_occurrence_in_a_sorted_array {
    public static void main(String[] args) {
        
        int target=13;
        int array[] = {3,4,13,13,13,13,13,20,40};

        int si= 0;
        int ei = array.length - 1;

        int ans = -1;

        while(si<=ei){
            int mid = (ei+si)/2;

            if(array[mid]==target){
                ans = mid;
                si = mid + 1;
            }

            else if(array[mid]<target){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }

        }

        System.err.println(ans);

    }
}
