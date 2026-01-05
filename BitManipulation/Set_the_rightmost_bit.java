package BitManipulation;

/*

Problem Statement: Given a positive integer n, set the rightmost unset (0) bit of its binary representation to 1 and return the resulting integer.
If all bits are already set, return the number as it is.

Examples
Example 1:
Input:
 n = 10 (binary: 1010)  
Output:
 11 (binary: 1011)  
Explanation:
  The rightmost unset bit is the least significant bit (LSB). Setting it to 1 gives 1011 = 11.

Example 2:
Input:
 n = 7 (binary: 111)  
Output:
 7 (binary: 111)  
Explanation:
  All bits are already set to 1, so the number remains the same.


*/


public class Set_the_rightmost_bit {
    public static void main(String[] args) {
        
        int n = 10;
        if((n&1) == 0){
            n = (n + 1);
        }

        System.out.println("New Number: "+ n);

    }
}
