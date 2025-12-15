package String.Easy;


public class RotateString {
        public static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){    return false;   }


        int indx = goal.indexOf(s.charAt(0));  
        int n = goal.length();

        System.out.println(indx);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt((i+indx+n)%n)){
                return false;
            }
        }

        return true;

    }
    
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
}
