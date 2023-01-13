package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int number: nums){
            addToFrequencyMap(number, frequencyMap);
        }

        int numsSize = nums.length;
        return majorityElement(frequencyMap,numsSize);
    }

    private static void addToFrequencyMap(int number, Map<Integer, Integer> frequencyMap){
        if(frequencyMap.containsKey(number)){
            frequencyMap.put(number,(frequencyMap.get(number) + 1));
        }
        else{
            frequencyMap.put(number,1);
        }
    }

    private static int majorityElement(Map<Integer, Integer> frequencyMap, int numsSize){
        for(int number: frequencyMap.keySet()){
            if(frequencyMap.get(number) > numsSize/2){
                return number;
            }
        }
        return -1;
    }
}
