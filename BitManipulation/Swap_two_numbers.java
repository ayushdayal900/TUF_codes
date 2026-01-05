package BitManipulation;

/*
Problem Statement: Given two integers a and b, swap them in-place using only 2 variables (without using a temporary variable).

Examples
Example 1:
Input:
 a = 5, b = 10
Output:
 a = 10, b = 5

Example 2:
Input:
 a = -100, b = -200
Output:
 a = -200, b = -100

*/


public class Swap_two_numbers {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        
        // 10 =     1010
        // b =       101
        // ----------------
        // a|b =    1111
        // a = a^b =    07
        // b = 07 ^ 5 = 111 ^ 101 = 2 = 10
        // a = 02 ^ 07 = 10 ^ 101 = 111
        // 111
        //  10
        // 101
        // b = a|b - b; = 15 - 5 = 10
        
        System.out.println("a: "+a+" b: "+b);
        
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a: "+a+" b: "+b);


    }
}
