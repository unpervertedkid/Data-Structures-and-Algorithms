package leetcode.arrays;

public class WhereWillTheBallFall {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        int[] result = findBall(grid);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            result[i] = findBall(grid, i);
        }
        return result;
    }

    private static int findBall(int[][] grid, int col) {
        int row = 0;
        while (row < grid.length) {
            if (grid[row][col] == 1) {
                if (col == grid[0].length - 1 || grid[row][col + 1] == -1) {
                    return -1;
                }
                col++;
            } else {
                if (col == 0 || grid[row][col - 1] == 1) {
                    return -1;
                }
                col--;
            }
            row++;
        }
        return col;
    }
}
