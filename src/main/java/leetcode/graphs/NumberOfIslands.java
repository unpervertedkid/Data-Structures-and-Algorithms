package leetcode.graphs;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int islands = 0;

        if(grid == null) return islands;

        int rows = grid.length;
        int columns = grid[0].length;


        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    findNeighborLands(grid,i,j);
                }
            }
        }
        return islands;
    }
    private static void findNeighborLands(char[][] grid, int row, int column){
        //Boundary checks
        if(row<0||row>=grid.length||column<0||column>=grid[0].length) return;
        //Validity check
        if(grid[row][column] == '0') return;

        grid[row][column] = '0';

        //Go up
        findNeighborLands(grid,row-1,column);
        //Go down
        findNeighborLands(grid,row+1,column);
        //Go left
        findNeighborLands(grid,row,column-1);
        //Go right
        findNeighborLands(grid,row,column+1);
    }
}
