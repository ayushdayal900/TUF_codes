public class MergeSort_practice {

    public static void merge_all(int[] nums, int si, int mid, int ei) {

        int[] merge = new int[ei - si + 1];
        int l = si;
        int r = mid + 1;
        int i = 0;

        while (l <= mid && r <= ei) {
            if (nums[l] <= nums[r]) {
                merge[i++] = nums[l++];
            } else {
                merge[i++] = nums[r++];
            }
        }

        while (l <= mid) {
            merge[i++] = nums[l++];
        }

        while (r <= ei) {
            merge[i++] = nums[r++];
        }

        for (int j = 0; j < merge.length; j++) {
            nums[si + j] = merge[j];
        }
    }

    public static void mergeSort(int[] nums, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);
        merge_all(nums, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 1, 6, 5, 9, 0};
        mergeSort(nums, 0, nums.length - 1);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
