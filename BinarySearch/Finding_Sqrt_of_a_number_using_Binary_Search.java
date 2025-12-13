public class Finding_Sqrt_of_a_number_using_Binary_Search {

    public static int ans(int n){

        int si = 1;
        int ei = n;

        while(si<=ei){
            int mid = si + (ei - si)/2;

            // System.out.println(mid);

            int prod = mid*mid;
            if(prod == n){  return mid; }

            else if(prod<n){    si = mid+1; }
            else{   ei = mid - 1;}
        }

        return -1;

    }


    public static void main(String[] args) {
        System.out.println(ans(49));
    }
}
