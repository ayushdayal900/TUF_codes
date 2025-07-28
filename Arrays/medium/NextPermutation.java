package medium;

public class NextPermutation {

    public static void reverse(int[] n, int si, int ei){
        while(si<ei){
            int t = n[si];
            n[si] = n[ei];
            n[ei] = t;
            si++;
            ei--;
        }
    }

    public static void swap(int[] n, int si, int ei){
        int t = n[si];
        n[si] = n[ei];
        n[ei] = t;
    }


    public static void main(String[] args) {
        
        int[] nums = {1,2,3};
        
        int indx = -1;
        for(int i=nums.length - 2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                indx = i;
                break;
            }
        }

        if(indx == -1){
            reverse(nums,0,nums.length - 1);
            return;
        }

        for(int i=nums.length-1; i>=0; i--){
            if(nums[indx]<nums[i]){
                swap(nums,indx,i);
                break;
            }
        }

        reverse(nums,indx+1,nums.length - 1);

        for(int i: nums){
            System.out.print(i+" ");
        }


    }
}
