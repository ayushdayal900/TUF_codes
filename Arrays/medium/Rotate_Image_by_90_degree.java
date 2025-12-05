package medium;

public class Rotate_Image_by_90_degree {

    public static void rotate(int[][] matrix) {
        // transpose
        int n = matrix.length;
    
        for(int r=0; r<n; r++){
            for( int c = r+1; c<n; c++){
                int x = matrix[c][r];
                matrix[c][r] = matrix[r][c];
                matrix[r][c] = x;
            }        
        }
        System.out.println("Transpose");
        for(int[] r: matrix ){
            for(int i:r){
                System.out.print(i+" ");
            }
            System.out.println();

        }

        // mirror
        int mid = n/2;
        for(int r=0; r<n; r++){
            for(int i=0; i<mid; i++){
                int x = matrix[r][i];
                matrix[r][i] = matrix[r][n-i-1];
                matrix[r][n-i-1] = x;
            }
        }
        System.out.println();
        System.out.println("Mirror Image");

        for(int[] r: matrix ){
            for(int i:r){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }



    public static void main(String[] args) {
        int m[][] =  {{0, 1, 1, 2}, {2, 0, 3, 1}, {4, 5, 0, 5}, {5, 6, 7, 0}};
        rotate(m);
    }
}
