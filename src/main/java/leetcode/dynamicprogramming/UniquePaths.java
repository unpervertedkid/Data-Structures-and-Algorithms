package leetcode.dynamicprogramming;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 5));
    }
    public static int uniquePaths(int m, int n) {
        //Initialize grid to size of 2D array
        int[][] grid = new int[m][n];

        for(int i = 0; i< m; i++){
            for(int j=0; j< n; j++){
                //Fill top row and rightmost column with 1;
                if(i == 0|| j==0){
                    grid[i][j] = 1;
                }
                //Fill the current cell with sum of paths from top and left
                else{
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        //Return the paths to the last cell;
        return grid[m-1][n-1];
    }
}
