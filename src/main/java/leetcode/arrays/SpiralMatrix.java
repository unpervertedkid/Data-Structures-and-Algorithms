package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if(matrix == null){
            return spiral;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(spiral.size() < m*n){
            //Go right
            for(int i= left; i <= right; i ++){
                spiral.add(matrix[top][i]);
            }
            top++;

            if(spiral.size() == m*n) break;
            //Go down
            for(int i = top; i <= bottom; i++){
                spiral.add(matrix[i][right]);
            }
            right--;

            if(spiral.size() == m*n) break;
            //Go left
            for(int i =right; i >= left; i--){
                spiral.add(matrix[bottom][i]);
            }
            bottom--;

            if(spiral.size() == m*n) break;

            //Go up
            for(int i = bottom; i>=top; i--){
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }
}
