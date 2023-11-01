package foobar;

public class ChallengeOne {
    public static int solution(String s) {
        // Find the shortest repeating substring
       int length = (s + s).indexOf(s, 1);
       // If there is no repeating substring, return 1
       if (length == -1) {
           return 1;
       }
       // Otherwise, return the quotient of dividing the length of the input string by
       // the length of the shortest repeating substring
       return s.length() / length;
    }
}
