package Recursion;

import java.util.Stack;

/*

Sort a Stack

Problem Statement: You are given a stack of integers. Your task is to sort the stack in 
descending order using recursion, such that the top of the stack contains the greatest element. 
You are not allowed to use any loop-based sorting methods (e.g., quicksort, mergesort). 
You may only use recursive operations and the standard stack operations (push, pop, peek/top, 
and isEmpty).

Examples

Example 1:
Input:  stack = [4, 1, 3, 2]

Output: [4, 3, 2, 1]
Explanation:
 After sorting, the largest element (4) is at the top, and the smallest (1) is at the bottom.

Example 2:
Input:  stack = [1]
Output: [1]
Explanation:
 A single-element stack is already sorted.
*/

public class Sort_a_Stack {

    public static void sort(Stack<Integer> st){

        // empty the stack which keeping the top element
        
        if(st.isEmpty()){
            return;
        }

        int top = st.pop(); // 4 --- 1-----3-----2
        // st: 2 ---- 3-------

        sort(st);

        insertStack(st, top);
    }

    public static void insertStack(Stack<Integer> st, int top){

        // if the stack is empty?
        if(st.isEmpty()  || st.peek() >= top){
            st.push(top);
            return;
        }

        int big = st.pop();

        insertStack(st, top);

        st.push(big);

    }


    
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        sort(st);

        for(int i: st){
            System.out.println(i);
        }

    }

}
