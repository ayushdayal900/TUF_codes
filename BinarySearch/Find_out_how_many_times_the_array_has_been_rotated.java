public class Find_out_how_many_times_the_array_has_been_rotated {

    public static int minPos(int[] arr){
        int si = 0;
        int ei = arr.length - 1;

        while(si<ei){
            int mid = si + (ei - si)/2;

            if(arr[mid]>arr[ei]){
                si = mid+1;
            }else{
                ei = mid;
            }
        }
        int minIndex = si;                         // index of minimum
        int maxIndex = (minIndex - 1 + arr.length) % arr.length;
        return arr[maxIndex];                      // return maximum
    }



    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int minIndex = minPos(arr);
        System.out.println(minIndex);
        // System.out.println("Array rotated this times: "+(minIndex - 1));
    }
}
