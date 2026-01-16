package Stack;

import java.util.*;

public class PostfixToInfix {
    public static void main(String[] args) {

        // in this cases
        // if operands(?): directly push in the stack
        // if operator(?): take last 2 element and add ( a ? b) format in stack 


        // ab-de+f*/
        String str = "ab-de+f*/";
        Stack<String> ans = new Stack<>();
        int i = 0;
        int n = str.length();

        while(i<n){

            char currChar = str.charAt(i);

            // if operands
            if(Character.isLetterOrDigit(currChar)){
                ans.push(Character.toString(currChar));
            }

            // if operator
            else{
                String s2 = ans.pop();
                String s1 = ans.pop();
                String addString = "("+s1+ currChar +s2+")";
                ans.push(addString);
            }
            i++;
        }


        System.out.println(ans.pop());

        







    }
}
