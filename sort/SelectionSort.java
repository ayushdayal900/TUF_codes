public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public void printArray(int[] nums) {
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] nums = {5, 3, 7, 4, 1};

        System.out.print("Original array: ");
        sorter.printArray(nums);

        sorter.selectionSort(nums);
        System.out.print("Sorted array (Selection Sort): ");
        sorter.printArray(nums);
    }
}
