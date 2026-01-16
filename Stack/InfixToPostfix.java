package Stack;

import java.util.*;

public class InfixToPostfix {

    public static int priority(char ch){

        if(ch == '+' || ch == '-'){ return 1;}
        else if(ch == '*' || ch == '/'){ return 2;}
        else if(ch == '^'){ return 3;}
        else 
            return -1;

    }

    public static boolean isRightShiftAssociative(char ch){
        if(ch == '^')   return true;
        return false;
    }


    public static void main(String[] args) {
        
        String str = "a+b*(c^d-e)^(f+g*h)-i";

        int i = 0;
        int n = str.length();
        Stack<Character> st = new Stack<>();

        StringBuilder ans = new StringBuilder();

        while(i<n){

            // curr char
            char currChar = str.charAt(i);

            // operand
            if(Character.isLetterOrDigit(currChar)){
                ans.append(currChar);
            }

            // (
            else if(currChar == '('){
                st.push(currChar);
            }

            // ) pop until we get (
            else if(!st.isEmpty() && currChar == ')'){
                while(st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }


            // operator
            else {
                while((!st.isEmpty() && st.peek() != '(' 
                    && (priority(currChar) < priority(st.peek()) || priority(currChar) == (priority(st.peek()))) 
                    && !isRightShiftAssociative(currChar))){
                        ans.append(st.pop());
                    }
                    st.push(currChar);
            }

            i++;
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        System.out.println(ans.toString());
      
    }
}
