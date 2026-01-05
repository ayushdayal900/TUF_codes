package BitManipulation;

/*


Problem Statement: Given a non-negative integer n, determine whether it is odd. Return true if the number is odd, otherwise return false. A number is odd if it is not divisible by 2 (i.e., n % 2 != 0).

Examples
Example 1:
Input:
 n = 7
Output:
 true
Explanation:
 7 is not divisible by 2. Hence, it is odd.

Example 2:
Input:
 n = 10
Output:
 false
Explanation:
 10 is divisible by 2. Hence, it is not odd.





*/



public class Check_if_a_number_is_odd_or_not {
    public static void main(String[] args) {
        
        int n = 8;

        if((n&1) == 1){
            System.out.println("Number is odd: " + n);
        }else{
            System.out.println("Number is even: " + n);
        }


    }
}
