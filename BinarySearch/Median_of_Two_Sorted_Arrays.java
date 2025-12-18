import java.util.ArrayList;



public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        
        // int[] nums1 = {1,3,5};
        // int[] nusm2 = {2,4,6};
        // int len = nums1.length + nusm2.length;


        // int[] merge = new int[len];

        // int k = 0;
        // for(int i: nums1){
        //     merge[k] = i;
        //     k++;
        // }
        // for(int i: nusm2){
        //     merge[k] = i;
        //     k++;
        // }

        // Arrays.sort(merge);

        // int mid = len/2;
        // if(len%2==0){
        //     System.out.println( (float)(merge[mid] + merge[mid - 1])/2 );
        // }else{
        //     System.out.println(merge[mid]);
        // }



        // ----------------------- m2

        int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6};

        int i=0;
        int j = 0;

        ArrayList<Integer> al = new ArrayList<>();

        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                al.add(nums1[i]);
                i++;
            }else{
                al.add(nums2[j]);
                j++;
            }
        }

        while(i<nums1.length){
            al.add(nums1[i]);
            i++;
        }

        while(j<nums2.length){
            al.add(nums2[j]);
            j++;
        }

        int len = al.size();
        int mid = len/2;

        if(len%2==0){
            System.out.println( (float)(al.get(mid) + al.get(mid - 1))/2);
        }else{
            System.out.println(al.get(mid));
        }


    }
}
