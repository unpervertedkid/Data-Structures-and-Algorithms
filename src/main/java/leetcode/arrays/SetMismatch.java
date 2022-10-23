package leetcode.arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length];
        //count the number of times each number appears
        for (int num : nums) {
            count[num - 1]++;
        }
        //find the duplicate number
        for (int i = 0; i < count.length; i++) {
            //if the number appears more than once, it is the duplicate number
            if (count[i] == 2) {
                result[0] = i + 1;
            }
            //if the number appears 0 times, it is the missing number
            if (count[i] == 0) {
                result[1] = i + 1;
            }
        }
        //return the duplicate and missing numbers
        return result;
    }
}

