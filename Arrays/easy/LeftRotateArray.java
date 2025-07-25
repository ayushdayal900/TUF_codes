package easy;

public class LeftRotateArray {

    public static void reverse(int f, int t, int[] nums){
        while(f<t){
            int p = nums[f];
            nums[f] = nums[t];
            nums[t] = p;
            f++;
            t--;
        }

    }



    public static void main(String[] args) {
        
        
        
        // 1 place
        /*
        // int[] nums = {1,2,3,4,5};
        int[] nums = {-1,0,3,6};
        int t = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[(i)] = nums[i];
        }
        nums[nums.length - 1] = t;

        for(int i: nums){
            System.out.print(i+" ");
        } 
            
        */

        //  for d index
        /*
        int[] nums = {1,2,3,4,5,6,7};
        int d = 2;
        d = d%nums.length;

        int[] temp = new int[d];
         
        for(int i=0; i<d; i++){
            temp[i] = nums[i];
        }
        for(int i=d; i<nums.length; i++){
            nums[i-d] = nums[i];
        }
        for(int i=0; i<d; i++){
            nums[nums.length - d + i] = temp[i];
        }

        for(int i : nums){
            System.out.print(i);
        }

        */


        int[] nums = {1,2,3,4,5,6,7};
        int d = 3;

        reverse(0,d-1,nums);
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();


        reverse(d,nums.length-1,nums);
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();

        reverse(0,nums.length-1,nums);     
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();
        
        
    }
}
