package practice;

import java.util.Arrays;

// Given a 2D integer array n*n matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
public class TransposeOfMatrix {

    public static int [][] Transpose (int[][]mat) {

        for (int row=0; row < mat.length; row++) {
            for (int col = row; col < mat[0].length; col++) {                    // Tc - O(n2)
                                                                                 // Sc - O(1)

                      int temp = mat [row][col];
                 mat[row][col] = mat [col][row];
                 mat[col][row] = temp;

            }
        }

        return mat;
    }
    public static void main(String[] args) {

        int [][] matrix = {

                {1, 2,  3,  4 },
                {5, 6,  7,  8 },
                {9, 10, 11, 12},
                {13,14 ,15, 16}

        };

       int [][] x =TransposeOfMatrix.Transpose(matrix);

       for (int i=0; i < x.length; i++) {
           for (int j=0; j < x[0].length; j++) {
               System.out.print( x[i][j] + " --> ");
           }
       }


    }
}
