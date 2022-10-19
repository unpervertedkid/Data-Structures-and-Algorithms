package leetcode.arrays;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int count = 0;

        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j ++){
                if(grid[i][j] == '1'){
                    count += 1;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int row, int column){
        if(row < 0 || row > grid.length -1 || column < 0 || column > grid[0].length -1 || grid[row][column] == '0'){
            return;
        }

        grid[row][column] = '0';

        //Go right
        dfs(grid,row,column+1);
        //Go left
        dfs(grid,row,column-1);
        //Go up
        dfs(grid, row+1, column);
        //Go down
        dfs(grid,row-1,column);

    }
}
