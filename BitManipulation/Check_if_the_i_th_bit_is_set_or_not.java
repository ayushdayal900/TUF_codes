package BitManipulation;

/*

Problem Statement: Given two integers n and i, return true if the ith bit in the binary representation of n (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1). Otherwise, return false.

Examples
Example 1:
Input: 
n = 5, i = 0
Output: 
true
Explanation: 
Binary representation of 5 is 101. The 0-th bit from LSB is set (1).

Example 2:
Input: 
n = 10, i = 1
Output: 
true
Explanation: 
Binary representation of 10 is 1010. The 1-st bit from LSB is set (1).

*/



public class Check_if_the_i_th_bit_is_set_or_not {
    public static void main(String[] args) {
        
        int mask = 1;
        // 10 100 1000
        int n = 5;
        // 101
        int i = 2;
        boolean ans = (n&(1<<i)) != 0? true:false;
        System.out.println("i'th bit is set as: " + ans);
        
    }
}
