package Stack;
import java.util.*;

public class InfixToPrefix {

    public static int priority(char ch){
        if(ch == '-' || ch == '+')  return 0;
        else if(ch == '*' || ch == '/')  return 1;
        else if(ch == '^')  return 2;
        else
            return -1;

    }

    public static boolean isRightShiftAssociative(char ch){
        if(ch == '^')   return true;
        return false;
    }


    public static void main(String[] args) {
        
        // String str = "(a+b)*c-d+f";
        // String str = "(p+q)*(m-n)";
        String str = " x+y*z/w+u";

        int i = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder(str);

        // infic to prefic
            // 1. reverse the string str
            // 2. infix to postfix
            // 3. reverse the ans

        // 1. reverse the string str
        str = ans.reverse().toString();
        ans = new StringBuilder();

        int n = str.length();

        // 2. infix to postfix
        while(i<n){

            char currChar = str.charAt(i);

            // letter ot digit
            if(Character.isLetterOrDigit(currChar)){
                ans.append(currChar);
            }

            // opening bracket = )
            // closing bracket = (

            else if(currChar == ')'){
                st.push(currChar);
            }

            else if(currChar == '('){
                while( !st.isEmpty() && st.peek() != ')'){
                    ans.append(st.pop());
                }
                st.pop();
            }

            // operator
            else{
                while(!st.isEmpty()
                    && currChar != ')'
                    && (priority(st.peek()) > priority(currChar))
                ){
                    ans.append(st.pop());
                }
                st.push(currChar);
            }
            i++;
            
        }
        
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
    
        System.out.println(ans.reverse().toString());

    }
}
