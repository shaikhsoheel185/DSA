package practice;

//Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
// A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
//All the visited cells of the path are 0.
//All the adjacent cells of the path are 8-directionally connected. The length of a clear path is the number of visited cells of this path.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_ShortestPathInBinaryMatrix {

    public static int ShortestPathBFS (int[][] g) {
        int [] dx= {-1,1, 0,0,-1,1, -1, 1};
        int [] dy= { 0,0,-1,1, 1,1, -1,-1};

        int row = g.length;
        int col = g[0].length;

        int [] a={1,1};
        Queue<int[]> Q=new LinkedList<>();

        Q.offer(a);

        int ans=0;
        int[] z= Q.peek();

        System.out.print(Arrays.toString(z));


        while (!Q.isEmpty()){

            int size=Q.size();
            ans++;


            while (size > 0) {

                int [] point = Q.poll();

                int x=point[0];
                int y=point[1];

                if (x == row && y == col ) {
                    return ans;
                }

                for (int k=0; k<8; k++){
                   int nx=x+dx[k];
                   int ny=y+dy[k];

                   if (nx >0 || nx <= row && ny >0 || ny <= col) continue;

                   if (g[nx][ny] == 0 ) {
                       Q.add(new int []{nx,ny} );
                   }


                    g[nx][ny]=1;

                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int [][] grid= {



                // 0 1 2 3 4
                  {0,1,1,1,1},   // 0
                  {0,1,0,0,0},   // 1
                  {0,0,0,1,0},   // 2



        };

       int x =BFS_ShortestPathInBinaryMatrix.ShortestPathBFS(grid);

       System.out.print(x);

    }
}
