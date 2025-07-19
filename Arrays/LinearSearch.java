package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 30){
                System.out.println("3 found at index: "+i);
                break;
            }
        }
        System.out.println(-1);
    }
}
