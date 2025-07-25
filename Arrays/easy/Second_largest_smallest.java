package easy;


/*
 Given an array of integers nums, return the second-largest element in the array. 
 If the second-largest element does not exist, return -1.

Examples:
Input: nums = [8, 8, 7, 6, 5]
Output: 7

Explanation: The largest value in nums is 8, the second largest is 7
Input: nums = [10, 10, 10, 10, 10]
Output: -1

Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned 
 */

public class Second_largest_smallest {
    public static void main(String[] args) {

        int[] arr = {8,8,7,6,5};
        // int max = arr[0];

        // for(int i: arr){
        //     if(i>max){
        //         max = i;
        //     }
        // }

        // System.out.println(max);
        
        // int ans = -1;
        // for(int j=0; j<arr.length; j++){
        //     if(arr[j]>ans && arr[j]!=max){
        //         ans=arr[j];
        //     }
        // }

        // System.out.println(ans);


        // m2

        int largest = arr[0];
        int slargest = -1;

        int smallest = Integer.MAX_VALUE;
        int ssmallest = -1;
        

        for(int i=1; i<arr.length; i++){
            if(arr[i]==largest){continue;}
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>slargest && arr[i]<largest){
                slargest = arr[i];
            }
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]==smallest){continue;}
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<ssmallest && arr[i]<smallest){
                ssmallest = arr[i];
            }
        }



        System.out.println(largest);
        System.out.println(slargest);

        System.out.println(smallest);
        System.out.println(ssmallest);

    }
    
}