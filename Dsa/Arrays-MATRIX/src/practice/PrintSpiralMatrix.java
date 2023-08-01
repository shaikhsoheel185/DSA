package practice;

// Given an m x n matrix, return all elements of the matrix in spiral order.
public class PrintSpiralMatrix {

    public static void print ( int[][]matrix ) {                              // {10,20,30,40}
                                                                               //{11,22,33,44}
                                                                               //{15,25,35,45}
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;                                            // Solution:

                                                                                 //  TC: O(mn)
                                                                                 //  Sc: O(1)

        if (matrix.length==0 || matrix[0].length==0) {
            return;
        }

        while(true){
                      for(int i = left; i <= right; i++) {
                          System.out.print( matrix [top][i] + "-->" );
                      }
            top++;

                      if(left > right || top > bottom) break;

                      for( int i = top; i <= bottom; i++ ) {
                      System.out.print( matrix [i][right] + "-->");
                      }
            right--;
                     if(left > right || top > bottom) break;

                     for( int i = right; i >= left; i-- ) {
                     System.out.print( matrix [bottom][i] + "-->");
                     }
            bottom--;
                     if( left > right || top > bottom ) break;

                     for( int i = bottom; i >= top; i-- ) {
                     System.out.print( matrix[i][left] +    "-->");
                     }
            left++;
                    if( left > right || top > bottom )  break;
        }

    }

    public static void main(String[] args) {
        int [][] matrix= {

                {10,20,30,40},
                {11,22,33,44},
                {15,25,35,45}

        };

        PrintSpiralMatrix.print(matrix);

    }
}
