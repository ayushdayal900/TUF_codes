package Arrays;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,1};

        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                System.out.println("Not Sorted");
                break;
            }
        }

        System.out.println("sorted");
    }
}
 