package ArraysMatrix;

import java.util.ArrayList;
import java.util.List;

public class PrintSpiralOrderOfMatrix {

    public static void print (int [][] matrix) {

        List<Integer> res = new ArrayList <>();
        int top= 0;
        int bottom= matrix.length-1;
        int left= 0;
        int right= matrix[0].length-1;

        while(true) {

            for (int i=left; i<=right; i++ ) {
                System.out.print( matrix [top] [i] + " " );
            }

            top ++;

            if ( top > bottom && left > right ) break;

            for ( int i=top; i<= bottom; i++ ) {
                System.out.print( matrix [i] [right] + " " );
            }

            right--;

            if (top > bottom && left > right) break;

            for (int i=right; i>= left; i-- ) {
                System.out.print(  matrix [bottom] [i] + " ");
            }
            bottom--;

            if (top > bottom && left > right) break;

            for(int i = bottom; i > top; i--) {
                System.out.print( matrix [i] [left] + " " );
            }
            left++;

            if (top > bottom && left > right) break;
        }

    }

    public static void main(String[] args) {
        int [][] matrix={

                {10,20,30,40,50},
                {11,22,33,44,55},
                {15,25,35,45,58}
        } ;

        PrintSpiralOrderOfMatrix.print(matrix);
    }
}
