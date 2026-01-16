package Stack;


import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        

        // prefix to postfix;
            // start from last

        Stack<String> ans = new Stack<>();
        String str = "/-ab*+def";
        int i = str.length()-1;

        while(i>=0){

            char currChar = str.charAt(i);

            // operand
            if('a'<=currChar && currChar<='z'){
                ans.push(Character.toString(currChar));
            }            
            
            // operator
            else{
                String s1 = ans.pop();
                String s2 = ans.pop();
                String addString = s1+s2+currChar;
                ans.push(addString);
            }
            i--;
        }

        System.out.println(ans.pop());


    }
}
