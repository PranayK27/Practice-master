package JavaChallenges;

class MatrixUtils{
    public static void rotate(int[][] matrix){
        int n=matrix.length;
        if (n <=1)
            return;

        /* layers */
        for (int i=0; i < n/2; i++){
            /* elements */
            for (int j=i; j < n-i-1; j++){
                // swap elements in the clockwise direction

                //temp = top-left
                int temp = matrix[i][j];

                //top-left <- bottom-left
                matrix[i][j] = matrix[n-1-j][i];

                //bottom-left <- bottom-right
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];

                //bottom-right <- top-right
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];

                //top-right <- top-left
                matrix[j][n-1-i] = temp;
            }
        }
    }
}

public class MatrixRotateBy90Degree {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {9, 10, 11, 12},
                {16, 17, 18, 19},
                {23, 24, 25, 26},
                {30, 31, 32, 33}
        };
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        MatrixUtils.rotate(matrix);
        System.out.println(" After 90 Degree Rotation");
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
