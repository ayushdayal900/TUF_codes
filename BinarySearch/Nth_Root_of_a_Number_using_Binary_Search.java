public class Nth_Root_of_a_Number_using_Binary_Search {

    public static int ans(int p,int n){

        int si = 1;
        int ei = n;

        while(si<=ei){
            int mid = si + (ei - si)/2;
            int pow = (int)Math.pow(mid,p);

            if(pow == n){  return mid; }
            
            else if(pow<n){ si = mid + 1;}
            else{   ei = mid - 1;}
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(ans(3,64));
    }
}
