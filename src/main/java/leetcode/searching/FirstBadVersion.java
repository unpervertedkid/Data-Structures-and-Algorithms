package leetcode.searching;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("First bad version = " + firstBadVersion(n));
    }
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while(low<high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)) high = mid;
            else low = mid +1;
        }

        return low;
    }
    private static boolean isBadVersion(int version){
        return version >= 4;
    }
}
