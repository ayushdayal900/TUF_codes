package Arrays;
// Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. 
// Find the union of two sorted arrays.
// The union of two arrays can be defined as the common and distinct elements in the two arrays.
// NOTE: Elements in the union should be in ascending order.

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        
        int[] n1 = {1,1,2,3,4,5};
        int[] n2 = {2,3,4,4,5,6};


        // BRUTE FORCE
        // HashSet<Integer> hs = new HashSet<>();
        
        // for(int i: n1){
        //     hs.add(i);
        // }
        // for(int i: n2){
        //     hs.add(i);
        // }
        // ArrayList<Integer> l = new ArrayList<>(hs);
        // l.sort(null);
        
        // OPTIMAL
        // ArrayList<Integer> al = new ArrayList<>();
        // int j=0;
        // for(int i=0; i<n1.length; i++){
        //     if(n1[i]<=n2[j]){
        //         if(!al.contains(n1[i])){
        //             al.add(n1[i]);
        //             continue;
        //         }
        //     }else{
        //         j++;
        //     }
        // }

        // for(int i=j; j<n2.length; j++){
        //     al.add(n2[j]);
        // }

        // for(int i: al){
        //     System.out.print(i);
        // }

        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1.length && j<n2.length){
            if(n1[i]<=n2[j]){
                if(al.size()==0 || al.getLast() != n1[i]){
                    al.add(n1[i]);
                }
                i++;
            }else{
                if(al.size()==0 || al.getLast() != n2[j]){
                    al.add(n2[j]);
                }
                j++;
            }
        }

        while(i<n1.length){
            if(al.getLast() != n1[i]){
                al.add(n1[i]);
            }
            i++;
        }
        
        while(j<n2.length){
            if(al.getLast() != n2[j]){
                al.add(n2[j]);
            }
            j++;
        }

        for(int k: al){
            System.out.print(k);
        }

    }    
}
