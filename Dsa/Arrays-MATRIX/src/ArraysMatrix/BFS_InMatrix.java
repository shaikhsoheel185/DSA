package ArraysMatrix;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_InMatrix {

    public static int  BFS (int [][] mat) {

        int r=mat.length;
        int c=mat[0].length;

        int [] xx= {-1,1, 0,0};
        int [] yy= {0 ,0,-1,1};

        Queue<int[]> Q= new LinkedList<>();
        Q.offer (new int[]{0,0}) ;
        int size  , Distance = 0;

        while (! Q.isEmpty()) {

            size = Q.size();
            Distance ++;

            while(size > 0) {

               int [] p = Q.poll();
               int x = p[0];
               int y = p[1];

               if  ( x== 2 && y== 2) {
                   return Distance;
               }

               for (int k=0; k<4; k++) {

                   int neX=x+xx[k];
                   int neY=y+yy[k];

                   if (neX > 0 || neX <= r && neY > 0 || neY <=c );

                   Q.offer(new int[]{neX,neY});


               }


            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int [][] mat = {

                {1,  2,  3,   4},
                {5,  6,  7,   8},
                {9,  10, 11, 12}

        };

        int ans =BFS_InMatrix.BFS(mat);
        System.out.print(" -> " +ans);
    }
}
