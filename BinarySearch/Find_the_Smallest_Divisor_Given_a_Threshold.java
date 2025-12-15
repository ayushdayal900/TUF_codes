public class Find_the_Smallest_Divisor_Given_a_Threshold {
    
    // Helper function
    public static int sum(int[] nums, int d) {
        int sum = 0;
        for (int n : nums) {
            sum += (n + d - 1) / d;   // ceil(n / d)
        }
        return sum;
    }

    // Main logic function
    public static int smallestDivisor(int[] nums, int threshold) {

        if (threshold < nums.length) {
            return -1;
        }

        int si = 1;
        int ei = Integer.MIN_VALUE;

        for (int n : nums) {
            ei = Math.max(ei, n);
        }

        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (sum(nums, mid) <= threshold) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }

    // main function
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        int result = smallestDivisor(nums, threshold);
        System.out.println(result);
    }
}
