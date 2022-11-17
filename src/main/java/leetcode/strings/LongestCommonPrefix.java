package leetcode.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        int prefixLength = 0;
        for(int i = 0; i < strs[0].length(); i ++ ){
            for(String s: strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return prefixLength == 0 ? "" : strs[0].substring(0,prefixLength);
                }
            }
            prefixLength++;
        }
        return prefixLength == 0 ? "" : strs[0].substring(0,prefixLength);
    }
}
