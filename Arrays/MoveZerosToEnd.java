package Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,2,0,0,4,5,1};

        // BRUTE FORCE METHOD
        // int[] ans = new int[nums.length];
        // int k=0;
        // for(int i : nums){
        //     if(i!=0){
        //         ans[k] = i;
        //         k++;
        //     }
        // }
        // for(int i:ans){
        //     System.out.print(i);
        // }

        // 2 POINTERS 
        int z=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                z = i;
                break;
            }
        }

        if(z==-1){
            for(int i: nums){
                System.out.print(i);
            }
        }

        for(int i=z+1; i<nums.length; i++){
            if(nums[i]!=0){
                // swap
                int t = nums[i];
                nums[i] = nums[z];
                nums[z] = t;
                
                z++;
            }
        }

        for(int i: nums){
            System.out.print(i);
        }

    }
}
