package medium;

public class MaxmSubarraySum {
    public static void main(String[] args) {
        
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        // int[] nums = {1};
        int max = -1;

        // brute force
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i; j<nums.length; j++){
        //         int sum = 0;
        //         for(int k=i; k<j+1; k++){
        //             sum+=nums[k];
        //             // System.out.print(sum );
        //         }
        //         // System.out.println();
        //         if(sum>max){
        //             max = sum;
        //         }
        //     }
            
        // }

        // System.out.println(max);


        // Slightly better approache
        // max = 0;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){

        //         sum+=nums[j];
        //         if(sum>max){
        //             max = sum;
        //         }
        //     }            
        // }



        // kadane's algo
        int sum = 0;
        int si = -1;
        int ei = -1;
        int start = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){

            
            if(sum == 0){
                start = i;
            }

            sum+=nums[i];

            if(sum>max){
                max = sum;
                ei = i;
                si = start;

            }
            if(sum<0){
                sum = 0;
                si = i;
            }
        }


        // System.out.println();
        System.out.println(max);
        System.out.println(si+":"+ei);


    }
}
