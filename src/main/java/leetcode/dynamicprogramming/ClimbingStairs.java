package leetcode.dynamicprogramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n) {
        int current = 1;
        int previous = 1;

        for(int i = 1; i < n;  i++){
            int temp = current;
            current = current + previous;
            previous = temp;
        }

        return current;
    }
}
