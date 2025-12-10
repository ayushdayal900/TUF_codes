public class Find_Peak_Element {
        public static int findPeakElement(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;

        while(si<ei){
            int mid = si + (ei - si)/2;

            // descending
            if(nums[mid]>nums[mid+1]){
                ei = mid;
            }
            // ascending
            // nusm[mid]<nums[mid+1]
            else{
                si = mid + 1;
            }

        }

        return si;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
}
