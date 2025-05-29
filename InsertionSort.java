public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public void printArray(int[] nums) {
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] nums = {5, 3, 7, 4, 1};

        System.out.print("Original array: ");
        sorter.printArray(nums);

        sorter.insertionSort(nums);
        System.out.print("Sorted array (Insertion Sort): ");
        sorter.printArray(nums);
    }
}
