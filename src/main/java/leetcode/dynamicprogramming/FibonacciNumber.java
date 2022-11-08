package leetcode.dynamicprogramming;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(30));
    }
    public static int fib(int n) {
        if(n == 0){
            return 0;
        }

        int previous = 0;
        int current = 1;

        for(int i = 1; i < n; i++){
            int temp = current + previous;
            previous = current;
            current = temp;
        }

        return current;

    }
}
