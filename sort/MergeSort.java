import java.util.ArrayList;

class MergeSort {
    public int[] mergeSort(int[] nums) {
        MS(nums, 0, nums.length - 1);
        return nums;
    }

    public void MS(int[] nums, int l, int h) {
        if (l >= h) return;
        int m = l + (h - l) / 2;
        MS(nums, l, m);
        MS(nums, m + 1, h);
        merge(nums, l, m, h);
    }

    public void merge(int[] nums, int low, int m, int h) {
        int l = low;
        int r = m + 1;
        ArrayList<Integer> t = new ArrayList<>();

        while (l <= m && r <= h) {
            if (nums[l] <= nums[r]) {
                t.add(nums[l++]);
            } else {
                t.add(nums[r++]);
            }
        }

        while (l <= m) {
            t.add(nums[l++]);
        }

        while (r <= h) {
            t.add(nums[r++]);
        }

        for (int i = 0; i < t.size(); i++) {
            nums[low + i] = t.get(i);
        }
    }

    public static void main(String[] args) {
        MergeSort solution = new MergeSort();

        int[] nums = {5, 3, 7, 4, 1};
        int[] sorted = solution.mergeSort(nums);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
