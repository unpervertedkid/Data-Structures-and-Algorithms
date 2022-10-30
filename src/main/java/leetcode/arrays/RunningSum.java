package leetcode.arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] runningSum(int[] nums){
        if(nums.length == 0) return nums;
        if(nums.length > 1){
            for(int i = 1; i < nums.length; i++){
                nums[i] = nums[i] + nums[i-1];
            }
        }
        return nums;
    }
}
