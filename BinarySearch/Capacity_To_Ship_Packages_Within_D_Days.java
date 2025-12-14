public class Capacity_To_Ship_Packages_Within_D_Days {
    public static int shipWithinDays(int[] weights, int days) {

        // iterate over max_load to sum_all_loads 
        int minC = 0;   // max load in weights
        int maxC = 0;

        for(int w: weights){    
            minC = Math.max(minC, w);
            maxC += w;
        }

        // so ow we got range from minC  to  maxC
        int si = minC;
        int ei = maxC;
        int ans = maxC;

        // bin search for best capacity in this range
        while(si<=ei){

            int cap = si + (ei - si)/2;

            // iterate over weights and get the required days needed to ship those load.

            int currLoad = 0;
            int reqDays = 1;
            for(int w: weights){
                if(currLoad + w <= cap){
                    currLoad += w;
                }else{
                    reqDays++;
                    currLoad = w;
                }
            }

            if(reqDays<=days){
                ans = cap;
                ei = cap - 1;
            }else{
                si = cap + 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(arr, days));
    }
}
