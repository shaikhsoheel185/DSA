package _2D_Array;

// Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
// You may assume all four edges of the grid are all surrounded by water

// Solution:
//T.C= O(m*n) where m is the no of row and n is the no of column.

public class NumberOfIsland {

    int dx[] = {-1,0,1,0};
    int dy[] = {0,1,0,-1};

    public void dfs(int x, int y, int r, int c, char [][] grid, boolean [][] vis)
    {
        if(x<0 || x>=r || y<0 || y>=c || vis[x][y]==true || grid[x][y] == '0') return;

        vis[x][y]=true;

        for(int i=0;i<4;i++)
        {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<r && ny>=0 && ny<c && vis[nx][ny]==false && grid[x][y] == '1')
                dfs(nx,ny,r,c,grid,vis);
        }

    }

    public int numIslands(char[][] g) {

        int r=g.length;
        int c=g[0].length;
        boolean[][] vis = new boolean[r+1][c+1];

        // vector<vector<bool>>vis(r,vector<bool>(c,false));
        int ans=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(g[i][j]=='1' && !vis[i][j])
                {
                    dfs(i,j,r,c,g,vis);
                    ans++;
                }
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] [] grid = {

                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}


        };

       //  //Output: 3
    }
}
