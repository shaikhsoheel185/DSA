package ArraysMatrix;

// You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
// connected 4-directionally (horizontal or vertical.)
// You may assume all four edges of the grid are surrounded by water.
//The area of an island is the number of cells with a value 1 in the island.
//Return the maximum area of an island in grid. If there is no island, return 0.




public class DFS_InMAtrix {
    public static int dfs(int x,int y, int r, int c, int[][] g, boolean[][] vis)
    {
        if(x<0 || y<0 || x>=r || y>=c || g[x][y]==0 || vis[x][y]==true)
            return 0;


        vis[x][y]=true;

        return 1 + dfs(x+1,y,r,c,g,vis) + dfs(x,y+1,r,c,g,vis) + dfs(x-1,y,r,c,g,vis) + dfs(x,y-1,r,c,g,vis);

    }

    public static int maxAreaOfIsland(int[][] g) {


        int r = g.length;
        int c = g[0].length;
        int ans=0;
        boolean[][] vis = new boolean[r+1][c+1];
        int cnt=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                cnt=1;
                if(g[i][j]==1 && vis[i][j]==false)
                {
                    cnt = dfs(i,j,r,c,g,vis);
                    if(cnt>ans)
                        ans=cnt;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {                                 // Tc - O( m n )

        int [][] grid ={

                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}


        };

        int ans =DFS_InMAtrix.maxAreaOfIsland(grid);

        System.out.print(ans);
    }
}
