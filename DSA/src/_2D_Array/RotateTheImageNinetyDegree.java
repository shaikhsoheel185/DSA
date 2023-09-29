package _2D_Array;

public class RotateTheImageNinetyDegree {

    public static int [][] RotateImage (int [][] m) {

        int row = m.length;
        int col = m[0].length;

        for (int i=0; i< m.length; i++) {
            for (int j=i; j<m[0].length; j++) {

                // Swap

                int temp = m[i][j];
                m[i][j]  = m[j][i];
                m[j][i]  = temp;

            }
        }

        for (int i=0; i < row; row++) {
            int left  =0;
            int right =row-1;

            while (left< right) {

                int temp;

                temp       = m[i][left];
                m[i][left] = m[i][right];
                m[i][right]= temp;

                left++;
                right--;

            }
        }
        return m;
    }


    public static void main(String[] args) {

        int[][] mat=  {
                {5 ,1, 9 ,11},  //       15  13  2   5
                {2 ,4, 8 ,10},  //       14  3   4   1
                {13,3, 6 , 7},  //       12  6   8   9
                {15,14,12,16}   //       16  7   10  11
        };

        int [][]a =_2D_Array.RotateTheImageNinetyDegree.RotateImage(mat);

        for (int i=0; i< a.length; i++) {
            for (int j=0; j< a[0].length; j++) {
                System.out.print(mat[i][j] + " => ");
            }
        }
    }
}
