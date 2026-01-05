package BitManipulation;


/*

Problem Statement: Given an integer n, return the number of set bits (1s) in its binary representation.
Can you solve it in O(log n) time complexity?

Examples
Example 1:
Input: 
n = 5
Output:
 2
Explanation: 
The binary representation of 5 is 101, which has 2 set bits.

Example 2:
Input: 
n = 15
Output: 
4
Explanation: 
The binary representation of 15 is 1111, which has 4 set bits.
            

*/


public class Count_the_number_of_set_bits {

    


    public static void main(String[] args) {
        
        int n = 15;
        int mask = 1;
        int c = 0;

        while(mask <= n){
            if((mask & n) != 0){
                c++;
            }
            mask = mask<<1;
        }

        System.out.println("Number of set bits : " + c);

    }
}
