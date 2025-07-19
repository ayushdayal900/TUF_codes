public class RecursiveBubbleSort {

    // Recursive function to perform bubble sort
    public static void bubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1) {
            return;
        }

        // One pass of bubble sort. After this, the largest element is at the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for the remaining unsorted part
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr, arr.length);

        System.out.println("Sorted array (Bubble Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
