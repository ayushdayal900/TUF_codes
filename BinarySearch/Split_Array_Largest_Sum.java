public class Split_Array_Largest_Sum {
    
    public static int getArr(int[] nums, int sum){

        int count = 1;
        int ArrSum = 0;

        for(int i=0; i<nums.length; i++){
            if(ArrSum + nums[i] <= sum){
                ArrSum += nums[i];
            }else{
                count++;
                ArrSum = nums[i];
            }
        }

        return count;


    }

    public static void main(String[] args) {
         int[] nums = {7,2,5,10,8};
        int k = 2;


        int si = Integer.MIN_VALUE;
        int ei = 0;
        int ans = -1;


        for(int i: nums){
            si = Math.max(si, i);
            ei += i;
        }

        // for(int i=si; i<=ei; i++){
        //     if(getArr(nums, i) == k){
        //         return i;
        //     }
        // }

        // int ans = 0;
        while(si<=ei){
            int mid = si + (ei - si)/2;
            if(getArr(nums, mid)<=k){
                ans = mid;
                ei = mid - 1;
            }else{
                si = mid + 1;
            }

        }
        System.out.println(ans);
    }
}
