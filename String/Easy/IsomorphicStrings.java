package String.Easy;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean solve (String s, String t){

        if(s.length() != t.length())    {   return false;   }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST.containsKey(c1)){
                if(mapST.get(c1)!=c2){
                    return false;}
            }else{
                mapST.put(c1, c2);
            }
        }

        for(int i=0; i<s.length(); i++){

            char c1 = t.charAt(i);
            char c2 = s.charAt(i);

            if(mapTS.containsKey(c1)){
                if(mapTS.get(c1)!=c2){
                    return false;}
            }else{
                mapST.put(c1, c2);
            }
        }



        
        return true;

    }

    public static void main(String[] args) {
        
        String s = "paper";
        String t = "tile";

        boolean ans = solve(s,t);
        System.out.println(ans);

    }
}
