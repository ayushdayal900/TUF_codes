public class Allocate_Minimum_Number_of_Pages {

    // The number of students required to allocate all books such that no student reads more than p pages.
    public static int getStudents(int[] arr, int p){

        int m = 1;
        int pagesStudent = 0;

        for(int i=0; i<arr.length; i++){
            if(pagesStudent + arr[i] <= p){
                pagesStudent += arr[i];
            }else{
                m++;
                pagesStudent = arr[i];
            }
        }

        return m;

    }

    public static void main(String[] args) {

        
        // int[] arr = {12,34,67,90};
        // int m = 2;
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;
        
        if (m>arr.length){ 
            System.out.println(-1);
        }

        int si = Integer.MIN_VALUE;
        int ei = 0;

        for(int i: arr){
            si = Math.max(si,i);
            ei += i;
        }

        // -------------------------------------m1
        // for(int p=si; p<=ei; p++){
        //     if(getStudents(arr, p) == m){
        //         System.out.println(p);
        //         break;
        //     }
        // }



        // ----------------------------------- m2

        int ans =0;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(getStudents(arr, mid) <= m){
                ans = mid;
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }

        System.out.println(ans);

        // System.out.println(si);


    }
}
