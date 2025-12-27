package Recursion;

import java.util.ArrayList;
import java.util.List;

/*

Problem Statement: Given an integer n, return all binary strings of length n that do not contain consecutive 1s. Return the result in lexicographically increasing order.

A binary string is a string consisting only of characters '0' and '1'.

Examples
Example 1:
Input:
 n = 3  
Output:
 ["000", "001", "010", "100", "101"]  
Explanation:
 All binary strings of length 3 that do not contain consecutive 1s.

Example 2:
Input:
 n = 2  
Output:
 ["00", "01", "10"]  
Explanation:
 All binary strings of length 2 that do not contain consecutive 1s.

*/


public class Generate_all_binary_strings {

    // backtracking()
    public static void backtrack(List<String> result, String curr, int n){

        // base condition
        if(curr.length() == 3){
            result.add(curr);
            return;
        }

        // always add 0
        backtrack(result, curr+"0", n);

        // restriction on 1's addition
        if(curr.length()==0 || curr.charAt(curr.length()-1) != '1'){
            backtrack(result, curr+"1", n);
        }
        
    }

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        int n = 3;
        backtrack(result, "", n);

        for(String s : result){
            System.out.println(s);
        }

    }
}
