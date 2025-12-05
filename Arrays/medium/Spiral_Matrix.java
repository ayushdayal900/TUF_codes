package medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        // int steps = matrix.length;
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> al = new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = m-1;

        while(top<=bottom && left <= right){

            //L-->R
            for(int i = left; i<=right; i++){
                al.add(matrix[top][i]);
            }
            top++;

            //T-->B
            for(int i = top; i<=bottom; i++){
                al.add(matrix[i][right]);
            }
            right--;

            //R-->L
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    al.add(matrix[bottom][i]);
                }
            }
            bottom--;

            
            //B-->T
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    al.add(matrix[i][left]);
                }
            }
            left++;
            
        }

        return al;
            
    }




// Driver code
    
    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            { 13,14, 15, 16 }
        };

        // Call spiralOrder function
        List ans = spiralOrder(matrix);

        // Print result
        System.out.println(ans);
    }

}