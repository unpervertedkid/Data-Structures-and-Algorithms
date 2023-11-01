package foobar;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The ChallengeTwo class contains a solution method that finds the minimum number of moves a knight can make on a chessboard to get from a source square to a destination square.
 * The class also contains a Cell class that represents a cell in the chessboard and has methods to check if the cell is valid or not, convert a cell to an integer and vice versa.
 * The class has a constant SIZE that defines the size of the chessboard and a constant MOVES that defines the possible moves a knight can make.
 */
public class ChallengeTwo {

    //Defining the size of the array
    public static final int SIZE = 8;

    // The possible moves a knight can make
    public static final int[][] MOVES =  {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
    
    // Class to represent a cell in the chessboard
    public static class Cell {
        int row;
        int column;
        int distance;

        public Cell(int row, int column, int distance) {
            this.row = row;
            this.column = column;
            this.distance = distance;
        }

        // Checks if the cell is valid or not
        public  boolean isValid() {
            return (row >= 0 && row < SIZE && column >= 0 && column < SIZE);
        }

        public int ToInt() {
            return (row * SIZE) + column;
        }

        public static Cell fromInt(int num) {
            return new Cell(num / SIZE, num % SIZE,0);
        }

    }

    public static int solution(int src, int dest) {
        Cell source = Cell.fromInt(src);
        Cell destination = Cell.fromInt(dest);

        // Return 0 if the destination is the same as source
        if (source.row == destination.row && source.column == destination.column) {
            return 0;
        }

        // Track the visited cells
        boolean[] visited = new boolean[SIZE * SIZE];


        Queue<Cell> queue = new LinkedList<>();
        

        queue.offer(source);

        visited[source.ToInt()] = true;

        //Perform BFS to find minimum steps
        while(!queue.isEmpty()) {

            Cell current = queue.poll();
            int distance = current.distance;

            // Check if the current cell is the destination
            if (current.row == destination.row && current.column == destination.column) {
                return distance;
            }

            // Loop through all the possible moves of a knight
            for(int[] move: MOVES) {
                Cell next = new Cell(current.row + move[0], current.column + move[1], distance + 1);
                
                //Check if next square is valid
                if( next.isValid() && !visited[next.ToInt()]) {
                    visited[next.ToInt()] = true;
                    queue.offer(next);
                }

            }


        }

        // Return -1 if the destination cannot be reached
        return -1;

    }

}
