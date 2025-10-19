package BinarySearch;



/*
 * Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
    The floor of x is the largest element in the array which is smaller than or equal to x.
    The ceiling of x is the smallest element in the array greater than or equal to x.

    Pre-requisite: Lower Bound & Binary Search

    Example 1:
    Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
    Result: 4 7
    Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

    Example 2:
    Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
    Result: 8 8
    Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
 */





public class Floor_and_Ceil_in_Sorted_Array {

    static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= x) {
                ans = arr[mid];
                //look for smaller index on the left
                low = mid + 1;
            } else {
                high = mid - 1; // look on the right
            }
        }
        return ans;
    }

    static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = arr[mid];
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }


    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int f = findFloor(arr, n, x);
        int c = findCeil(arr, n, x);
        return new int[] {f, c};
    }


    public static void main(String[] args) {
        
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 8;
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0]
                           + " " + ans[1]);

    }
}
