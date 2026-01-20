import java.util.LinkedList;
import java.util.Queue;

public class Maximum_1 {
    public static void main(String[] args) {
        
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        // Queue<Integer> q = new LinkedList<>();
        // int r=0, l=0, len=0, max=0, n=nums.length, zeros=0;

        // while(r<n){
        //     int curr = nums[r];

        //     if(curr == 0){
        //         zeros++;
        //         q.offer(r);
        //     }

        //     if(zeros > k){
        //         l = q.poll() + 1;
        //         zeros--;
        //     }

        //     len = r - l + 1;
        //     max = Math.max(max, len);
        //     r++;
        // }

        // System.out.println(max);
        
        
        Queue<Integer> q = new LinkedList<>();
        int r=0, l=0, len=0, max=0, n=nums.length, zeros=0;

        while(r<n){
            int curr = nums[r];

            if(curr == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[l]==0)
                    zeros--;
                l++;
            }

            len = r - l + 1;
            max = Math.max(max, len);
            r++;
        }

        System.out.println(max);








    }

}
