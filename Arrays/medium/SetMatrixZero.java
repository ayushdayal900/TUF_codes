package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SetMatrixZero {

    public static void changeMatrix(int[][] mat){

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        // find zero
        int r=0;
        int x = -1;
        int y = -1;
        for(int[] row: mat){
            for(int c=0; c<row.length; c++){
                if(row[c]==0){
                    x = r;
                    y = c;

                    ArrayList<Integer> points = new ArrayList<>();
                    points.add(x);
                    points.add(y);
                    
                    al.add(points);

                }
            }
            r++;
        }

        for(ArrayList<Integer> a: al){

            int x1 = a.get(0);
            int y1 = a.get(1);

            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    
                    if(x1 == i || y1 == j){
                        mat[i][j] = 0;
                    }

                }
            }

        }
            
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] matrix = { {1,1,1}, {1,0,1}, {1,1,1}};
        int[][] matrix = { {0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        changeMatrix(matrix);
    }
}
