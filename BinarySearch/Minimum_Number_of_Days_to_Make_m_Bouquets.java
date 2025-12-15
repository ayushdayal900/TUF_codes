public class Minimum_Number_of_Days_to_Make_m_Bouquets {

    // Helper function
    public static boolean canMakeBouquet(int[] bloomDay, int days, int m, int k) {
        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }

    // Main logic function
    public static int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int d : bloomDay) {
            minDay = Math.min(minDay, d);
            maxDay = Math.max(maxDay, d);
        }

        int ans = -1;

        while (minDay <= maxDay) {
            int mid = minDay + (maxDay - minDay) / 2;

            if (canMakeBouquet(bloomDay, mid, m, k)) {
                ans = mid;
                maxDay = mid - 1;
            } else {
                minDay = mid + 1;
            }
        }
        return ans;
    }

    // main function
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        int result = minDays(bloomDay, m, k);
        System.out.println(result);
    }
}
