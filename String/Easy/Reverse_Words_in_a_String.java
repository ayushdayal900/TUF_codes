package String.Easy;

public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        
        s = s.strip();
        String ans = "";
        String words[] = s.split("\\s+");

        for(int i=words.length-1; i>0; i--){
            // System.out.print(words[i]+" ");
            ans += words[i]+" ";
        }

        ans+=words[0];
        return ans;
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
