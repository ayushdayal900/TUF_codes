package medium;

import java.util.HashMap;

public class setCollours {
    public static void main(String[] args) {
        
        // n
        // 2+2+2 ->n
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {2,0,2,1,1,0};
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int len = 0;

        for(int i=0; i<3; i++){
            if(map.containsKey(i)){
                for(int j=0; j<map.get(i); j++){
                    nums[len] = i;
                    len++;
                }
            }
            
        }

        for(int i: nums){
            System.out.print(i+" ");
        }
        


    }
}
