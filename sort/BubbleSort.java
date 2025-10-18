public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public void printArray(int[] nums) {
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] nums = {5, 3, 7, 4, 1};

        System.out.print("Original array: ");
        sorter.printArray(nums);

        sorter.bubbleSort(nums);
        System.out.print("Sorted array (Bubble Sort): ");
        sorter.printArray(nums);
    }
}
