package leetcode.strings;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
       String test = "HellO World";
        System.out.println("Before = " + test);
        System.out.println("Reversed Vowels = " + reverseVowels(test));
        System.out.println();
        String test1 = "Just Another String";
        System.out.println("Before = " + test1);
        System.out.println("Reversed vowels = " + reverseVowels(test1));

    }
    private static String reverseVowels(String s){
       if( s == null || s.length() < 2) {
           return s;
       }
       StringBuilder sb = new StringBuilder(s);

       int start = 0;
       int end = s.length() -1;

       while(start < end){
           while(!isVowel(s.charAt(start)) && start < end) start ++;
           while(!isVowel(s.charAt(end)) && start < end) end --;

           char charAtStart = s.charAt(start);
           char charAtEnd = s.charAt(end);

           if(isVowel(charAtStart) && isVowel(charAtEnd)){
               sb.setCharAt(start,charAtEnd);
               sb.setCharAt(end,charAtStart);

               start++;
               end--;
           }
       }

       return sb.toString();
    }
    private static boolean isVowel(char character){
        char c = Character.toLowerCase(character);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
