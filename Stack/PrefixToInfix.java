package Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        
        // reverse the given string 
        // iterate over it.
        // 2nd element is top1 and 1st is top2 while pop

        String str = "*+pq-mn";
        Stack<String> ans = new Stack<>();
        int i = str.length()-1;

        while(i>=0){    //O(n)

            char currChar = str.charAt(i);

            // opearand
            // letter or digit
            if(Character.isLetterOrDigit(currChar)){
                ans.push(Character.toString(currChar));
            }

            // operator
            else{
                String s1 = ans.pop();
                String s2 = ans.pop();
                String addString = "("+s1+currChar+s2+")";  //O(n1 + n2): addition of 2 strings having res lengths
                ans.push(addString);
            }
            i--;
        }

        System.out.println(ans.pop());
    }
}
