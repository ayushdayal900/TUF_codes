package medium;

import java.util.HashMap;

public class MajorityElementThan_n_by_2 {
    public static void main(String[] args) {
        
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int k = nums.length/2;
        // System.out.println(len);

        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i:nums){
        //     hm.put(i,hm.getOrDefault(i,0)+1);
        //     if(hm.get(i)>k){
        //         System.out.println(i);
        //     }
        // }



        // Apply Moorse Algorithm
        int e = 0;
        int c = 0;

        int i=0;
        while(i<nums.length){
            if(i==0){
                e = nums[0];
                c++;
            }
            else if(e==nums[i]){
                c++;
            }else{
                c--;
            }
            i++;
        }

        System.out.println(e+" : "+c);

        int c1 = 0;
        for(int m : nums){
            if(m==e){
                c1++;
            }
        }

        if(c1>nums.length/2){
            System.out.println(e+" : "+c1);
        }else{
            System.out.println(-1);
        }






    }
}