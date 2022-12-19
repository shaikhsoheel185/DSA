package practice;

public class MaximumSizeSquareSubMatrixWithAllOnes {

    public static int SquareOnes (int [][]arr ) {

        int row= arr.length;
        int col= arr[0].length;
        int result=0;

        int [][] aux=new int[row+1][col+1];

        if (row==0 || col==0) {
            return   0;
        }

        for (int i=1; i<=row; i++){
            for (int j=1; j<= col; j++) {
                if (arr[i-1][j-1]== 1) {
                    aux[i][j] = Math.min(Math.min(aux[i][j-1] , aux[i-1][j-1]), aux[i-1][j]) + 1;
                    result = Math.max(aux[i][j],result );
                }
            }
        }

        return result*result;

    }

    public static void main(String[] args) {
        int [][] arr={
                {1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
        };
        int res =MaximumSizeSquareSubMatrixWithAllOnes.SquareOnes(arr);
        System.out.print(res);
    }
}
