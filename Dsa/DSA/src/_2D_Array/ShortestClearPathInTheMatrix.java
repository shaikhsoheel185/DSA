package _2D_Array;

// Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
// A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
//All the visited cells of the path are 0.
//All the adjacent cells of the path are 8-directionally connected. The length of a clear path is the number of visited cells of this path.
//
//
//Solution:
//
//TC: O(n*n)
//SC: O(n*n)



//                                             Breadth First Traversal In Matrix
public class ShortestClearPathInTheMatrix {

    /*public int shortestPathBinaryMatrix(int[][] g) {

        int dx[] = {-1,0,1,1,1,0,-1,-1};
        int dy[] = {1,1,1,0,-1,-1,-1,0};
        int r=g.length;
        int c=g[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int ans = 0;

        if(g[0][0]==1)
            return -1;



        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            ans++;

            while(levelSize-->0) {

                int[] point = queue.poll();
                int xx = point[0];
                int yy = point[1];

                if (xx == r - 1 && yy == c - 1) {
                    return ans-1;
                }

                for(int k=0;k<8;k++){

                    int nx = xx + dx[k];
                    int ny = yy + dy[k];

                    if(nx<0 || nx>=r || ny<0 || ny>=c)
                        continue;

                    if(g[nx][ny]==1)
                        continue;

                    queue.offer(new int[]{nx, ny});
                    g[nx][ny]=1;

                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }*/
}
