package leetcode.arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        // 1. find the sum of all elements
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 2. find the sum of left elements
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // 3. if leftSum == sum - leftSum - nums[i], return i
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            // 4. add nums[i] to leftSum
            leftSum += nums[i];
        }
        // 5. if no pivot index found, return -1
        return -1;
    }
}
