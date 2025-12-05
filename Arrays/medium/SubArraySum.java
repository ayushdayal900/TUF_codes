package medium;

public class SubArraySum {
     public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){

                sum += nums[j];

                if(sum==k){
                    ans++;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3};
        int ans = subarraySum(arr, 3);
        System.out.println(ans);
    }
}
