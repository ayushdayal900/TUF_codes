public class Koko_Eating_Bananas {


    public static int solve(int[] piles, int h){
                // int  k =?

        int si = 0;
        int ei = -1;

        // init ei with maximum piles
        for(int i : piles){
            ei = Math.max(i, ei);
        }

        // by default ans will be the maximum if no less speed satisfies the ans.
        int ans = ei;

        while(si<=ei){

            // mid is basically k
            int mid = si + (ei - si)/2;
   
            // get sum
            int sum = 0;
            // for(int p:piles){   sum += Math.ceil(p/mid);   }
            for(int p: piles){  sum += (p + mid - 1)/ mid;  }
            


            // System.out.println(sum);

            if(sum<=h)  {   ans = mid; ei = mid-1; }
            else{   si = mid + 1;}
        }

        return ans;

    }
    
    public static void main(String[] args) {
        
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println(solve(piles1, h1)); // 4

        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println(solve(piles2, h2)); // 30

        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println(solve(piles3, h3)); // 23


    }


}
