package leetcode.strings;

public class SubsequentString {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

        String s1 = "axc";
        String t1 = "ahbgdc";
        System.out.println(isSubsequence(s1, t1));
    }

    /*
    Given a string s and a string t, check if s is subsequence of t.
     */
    public static boolean isSubsequence(String s, String t) {

        if(t.length() < s.length()){
            return false;
        }

        int current = 0;
        // iterate through t
        for(int i = 0; i< t.length(); i++){
            // if the current char in t is equal to the current char in s then increment current
            if(current < s.length()){
                if(s.charAt(current) == t.charAt(i)){
                    current++;
                }
            }
        }
        // if current is equal to the length of s then return true
        return current == s.length();
    }
}
