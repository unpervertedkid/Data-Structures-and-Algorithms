package leetcode.dynamicprogramming;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 7;
        if(isHappy(n)){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not a Happy Number");
        }
    }
    //Is happy number
    public static boolean isHappy(int n) {
        if(n==1)return true;
        if(n<=4)return false;
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans+=(rem*rem);
            n/=10;
        }
        return isHappy(ans);
    }
}
