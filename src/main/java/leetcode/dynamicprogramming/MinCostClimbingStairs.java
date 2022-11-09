package leetcode.dynamicprogramming;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
    public static int minCostClimbingStairs(int[] cost) {

        int far = cost[0];
        int near = cost[1];

        for(int i =2 ;i<cost.length ;i++){
            int temp = cost [i] + Math.min(far,near);
            far = near;
            near = temp;

        }
        return Math.min(far,near);

    }
}
