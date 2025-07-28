package medium;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        
        int[] nums ={3,1,-2,-5,2,-4};

        int pi = -2;
        int ni = -1;
        int[] r = new int[nums.length];

        for(int i:nums){
            if(i>=0){
                pi+=2;
                r[pi] = i;
            }else{
                ni+=2;
                r[ni] = i;
            }
        }
        
        for(int i:r){
            System.out.print(i+" ");
        }


    }
}
