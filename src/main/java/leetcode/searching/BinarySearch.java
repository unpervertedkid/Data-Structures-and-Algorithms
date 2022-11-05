package leetcode.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println("Target = " + target);
        System.out.println("Index of target = " + search(nums, target));
        System.out.println();
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target1 = 11;
        System.out.println("Target = " + target1);
        System.out.println("Index of target = " + search(nums1, target1));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;

        while(low<=high){
            int mid = (low + high)/2;
            int current = nums[mid];

            if(current == target) return mid;
            else if(current<target) low = mid+1;
            else high = mid -1;
        }

        return -1;
    }
}
