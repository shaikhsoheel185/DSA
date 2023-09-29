package _2D_Array;

// Given an m x n integer matrix, if an element is 0,
// set its entire row and column to 0's
// You must do it in place.

public class SetZeroesInMatrix {

    /*public static void setZeroes(int[][] matrix) {
        int col_no_0=0;
        int row_no_0=0;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
                col_no_0=1;
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1;i<matrix.size();i++)
        {
            for(int j=1;j<matrix[0].size();j++)
            {

                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0)

            for(int j=0;j<matrix[0].size();j++)
                matrix[0][j]=0;


        if(col_no_0==1)
        {
            for(int j=0;j<matrix.size();j++)
                matrix[j][0]=0;
        }


    }
*/

    public static void main(String[] args) {
        int [] [] matrix = {

                {0,1,2,0},
                {3,4,5,2},
                {1,3,4,5},
        };

        /*SetZeroesInMatrix.setZeroes(matrix);*/
    }
}
