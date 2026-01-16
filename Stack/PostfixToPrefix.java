package Stack;

import java.util.*;

public class PostfixToPrefix {
    public static void main(String[] args) {
        

        String str = "ab-de+f*/";
        Stack<String> ans = new Stack<>();
        int i = 0;
        int n = str.length();

        while(i<n){

            char currChar = str.charAt(i);

            // operand
            if(currChar >= 'a' && currChar <= 'z'){
                ans.push(Character.toString(currChar));
            }

            // operator
            else{
                String s1 = ans.pop();
                String s2 = ans.pop();
                String addString = currChar+s2+s1;
                ans.push(addString);
            }
            i++;
        }

        System.out.println(ans.pop());

    }
}
