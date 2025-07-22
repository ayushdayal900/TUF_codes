package Arrays;


// Problem Statement: Given an array that contains only 1 and 0 
// return the count of maximum consecutive ones in the array.


public class ConsecutiesOnes {
    public static void main(String[] args) {
        
        // int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 0, 1, 1, 0, 1};
        int sum = 0;;
        int max = -1;
        for(int i:nums){
            if(i==0){
                if(sum>max){
                    max = sum;
                }
                sum = 0;
                continue;
            }
            sum++;
        }
        if(sum>max){
            max = sum;
        }

        System.out.println(max);
    }
}
