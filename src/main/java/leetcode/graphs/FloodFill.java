package leetcode.graphs;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image == null) return null;
        //To keep track of visited nodes
        boolean[][] visited = new boolean[image.length][image[0].length];
        //Keep track of the start color
        int startColor = image[sr][sc];

        floodFillHelper(image,visited,sr,sc,startColor,color);

        return image;
    }
    private static void floodFillHelper(int[][] image, boolean[][] visited, int row, int column, int startColor, int fillColor){
        //Boundary checks
        if(row<0 || row>= image.length || column < 0 || column >= image[0].length) return;
        //Check if already filled or is same
        if(image[row][column] == fillColor) return;
        //Validity check
        if(visited[row][column] || image[row][column] != startColor) return;

        image[row][column] = fillColor;

        //Go up
        floodFillHelper(image,visited,row-1,column,startColor,fillColor);
        //Go down
        floodFillHelper(image,visited,row+1,column,startColor,fillColor);
        //Go left
        floodFillHelper(image,visited,row,column -1,startColor,fillColor);
        //Go right
        floodFillHelper(image,visited,row,column + 1,startColor,fillColor);
    }
}
