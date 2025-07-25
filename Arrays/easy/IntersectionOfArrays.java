package easy;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] n1 = {1,2,2,3,3,4,5,6};
        int[] n2 = {2,3,3,5,6,6,7};

        int i=0, j=0;
        ArrayList<Integer> al = new ArrayList<>();
        while (i<n1.length && j<n2.length) {
            if(n1[i]<n2[j]){
                i++;
            }
            else if(n1[i]>n2[j]){
                j++;
            }
            else{
                if(al.isEmpty() || al.get(al.size() - 1) != n1[i]){
                    al.add(n1[i]);
                }
                // al.add(n1[i]);
                i++;
                j++;
            }
        }

        for(int v : al){
            System.out.print(v);
        }

    }
}
