package leetcode.arrays;

import java.util.HashMap;

public class TwoSum {
    //Approach one
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(numbers.containsKey(num)){
                return new int[]{i,numbers.get(num)};
            }
            else{
                int remainder = target - num;
                numbers.put(remainder,i);
            }
        }
        return new int[0];
    }
    //Approach 2
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[j] + nums[j - i]) == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }
}
