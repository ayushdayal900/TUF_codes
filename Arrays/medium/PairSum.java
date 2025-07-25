package medium;

public class PairSum { 

    // var 1
    /*
     *     public static boolean checkInArray(int si, int[] a, int key){
        for(int i=si; i<a.length; i++){
            if(a[i]==key){return true;}
        }
        return false;
    }
    public static void main(String[] args) {
        
        
        int[] nums = {2,6,5,8,11};
        int target = 15;
        String ans = "no";
        for(int i=0; i<nums.length; i++){
            if(checkInArray(i+1,nums,target-nums[i])){
                ans = "yes";
            }
        }
        System.out.println(ans);

     */





    public static int checkInArray(int si, int[] a, int key){

        int j = -1;
        for(int i=si; i<a.length; i++){
            if(a[i]==key){
                j = i;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        
        
        // int[] nums = {2,6,5,8,11};
        // int target = 14;


        // O(n^2)
        // // String ans = "no";
        // int[] ans = new int[2];

        // for(int i=0; i<nums.length; i++){
        //     int k = checkInArray(i+1,nums,target-nums[i]);
        //     if( k != -1){
        //         ans[0] = i;
        //         ans[1] = k;
        //     }
        // }

        // if(ans[0]==0 && ans[1]==0){
        //     ans[0] = -1;
        //     ans[1] = -1;
        // }

        // System.out.println(ans[0]+" "+ ans[1]);






        // leetcode-------hashmap------------O(n)
        /*
         * int ans[] = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
         */




        //  2 pointers method
        int[] nums = {2,6,5,8,11};
        int target = 14;

        int si = 0;
        int ei = nums.length - 1;

        while(si<ei){
            if(nums[si]+nums[ei]==target){
                // return new int[]{si,ei};
            }
        }

    }
}