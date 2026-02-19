import java.util.Arrays;

public class Frog_Jump {

    public static int helper(int[] heights){
        // tabulation
        if(heights.length ==0 || heights == null)   return 0;
        
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        for(int i = 1; i<n; i++){
            int jumOne = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            int jumpTwo = Integer.MAX_VALUE;
            if(i > 1){
                jumpTwo = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(jumOne, jumpTwo);
        }
        return dp[n-1];
    }


    public static int helper2(int i, int[] heights, int[] dp){
        if(i == 0){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int jumpTwo = Integer.MAX_VALUE;

        int jumpOne = helper2(i-1, heights, dp) + Math.abs(heights[i] - heights[i-1]);

        if(i > 1){
            jumpTwo = helper2(i-2, heights, dp) + Math.abs(heights[i] - heights[i - 2]);
        }

        dp[i] = Math.min(jumpOne, jumpTwo);
        return dp[i];




    }

    public static int solve(int[] heights){

        if(heights == null || heights.length == 0)  return 0;

        int n = heights.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return helper2(n-1, heights, dp);

    }


    public static void main(String[] args) {
        

        // int[] heights = {2,1,3,5,4};
        // int[] heights = {7, 5, 1, 2, 6};
        int[] heights = {30, 10, 60, 10, 60, 50};

        // helper(heights);
        // System.out.println(helper(heights));
        System.out.println(solve(heights));


    }
}
