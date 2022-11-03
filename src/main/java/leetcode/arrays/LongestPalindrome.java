package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("ccc"));
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        Set<Character> chars = new HashSet<>();

        int count = 0;

        for(int i = 0; i < s.length();i++){
            char current = s.charAt(i);
            if(chars.contains(current)){
                chars.remove(current);
                count++;
            }else{
                chars.add(current);
            }
        }

        if(!chars.isEmpty()) return count*2+1;

        return count*2;
    }
}
