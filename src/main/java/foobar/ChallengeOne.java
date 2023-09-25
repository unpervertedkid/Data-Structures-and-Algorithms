package foobar;

public class ChallengeOne {
    public static void main(String[] args) {
        int testCaseOne = solution("abcabcabcabc");
        int testCaseTwo = solution("abccbaabccba");
        int testCaseThree = solution("abcabcabc");
        int testCaseFour = solution("abccbaabccba");

        System.out.println("Test case 1: abcabcabcabc -> " + testCaseOne);
        System.out.println("Test case 2: abccbaabccba -> " + testCaseTwo);
        System.out.println("Test case 3: abcabcabc -> " + testCaseThree);
        System.out.println("Test case 4: abccbaabccba -> " + testCaseFour);
    }

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
