package practice;


 //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise)
 // You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 // DO NOT allocate another 2D matrix and do the rotation.


public class RotateTheImageNinetyDegree {

    public static  int[][] RotateImage (int [][]mat) {

        int m= mat.length;
        int n= mat[0].length;                                  // Tc =  O(n2)
                                                               // Sc =  O(1)
        for (int i=0; i<m; i++) {
            for (int j=i; j<n; j++) {

                int temp;
                temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for (int i=0; i<m; i++) {

            int left = 0;
            int right=m-1;

            while (left < right) {

                int temp;
                temp= mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right]=temp;

                left++;
                right--;

            }
        }
        return mat;
    }


    public static void main(String[] args) {

        int[][] mat=  {
                {5 ,1, 9 ,11},  //       15  13  2   5
                {2 ,4, 8 ,10},  //       14  3   4   1
                {13,3, 6 , 7},  //       12  6   8   9
                {15,14,12,16}   //       16  7   10  11
        };

        int[][] c =RotateTheImageNinetyDegree.RotateImage(mat);

        for (int i=0; i< c.length; i++) {

            for (int j=0; j<c[0].length; j++) {

                System.out.print(c[i][j]+ " --> ");

            }
        }
    }

}
