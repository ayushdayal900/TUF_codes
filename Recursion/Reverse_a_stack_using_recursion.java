package Recursion;

import java.util.Stack;

/*

Problem Statement: You are given a stack of integers. Your task is to reverse the stack using recursion. You may only use standard stack operations (push, pop, top/peek, isEmpty). You are not allowed to use any loop constructs or additional data structures like arrays or queues.

Your solution must modify the input stack in-place to reverse the order of its elements.

Examples
Example 1:
Input:
 stack = [4, 1, 3, 2]  
Output:
 [2, 3, 1, 4]

Example 2:
Input:
 stack = [10, 20, -5, 7, 15]  
Output:
 [15, 7, -5, 20, 10]


*/

public class Reverse_a_stack_using_recursion {


    public static void reverse(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int top = st.pop();

        reverse(st);

        // top : 2

        insertBottom(st, top);        

    }

    public static void insertBottom(Stack<Integer> st, int elm){

        if(st.isEmpty()){
            st.push(elm);
            return;
        }

        int keep_elm = st.pop();

        insertBottom(st, elm);

        st.push(keep_elm);

    }


    
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        reverse(st);

        for(int i: st){
            System.out.println(i);
        }
    }
}
