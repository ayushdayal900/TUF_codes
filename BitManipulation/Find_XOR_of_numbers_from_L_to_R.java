package BitManipulation;

public class Find_XOR_of_numbers_from_L_to_R {
    public static void main(String[] args) {
        

        int l = 1;
        int r = 3;
        int ans = l;
        for(int i=l+1; i<=r; i++){
            ans = ans ^ i;
        }

        // 001
        // 010
        // 011
        // -------
        // 000


        System.out.println(ans);
    }
}
