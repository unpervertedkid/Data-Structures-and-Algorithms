package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() ==0){
            return 0;
        }
        //Start at the beginning of string
        //The start pointer shows the index of the start of the non repeating-character string
        int start = 0;
        //The end of the string without non repeating characters
        int end;

        int maxLength = 0;
        //Map to hold characters and their indices
        Map<Character,Integer> characters = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            end = i;
            char current = s.charAt(i);
            //When we find a character that is already in the map(repeated)
            if(characters.containsKey(current)){
                int indexOfChar = characters.get(current);
                /*
                If the index of that character is less than the current start,
                  Retain start, otherwise move start to the index after that character's
                  */
                if(indexOfChar >= start){
                    start = indexOfChar+1;
                }


            }
            characters.put(current,i);

            //Find the length of the substring without repeating characters and update max  if its greater

            maxLength = Math.max(maxLength,(end-start)+1);
        }
        return maxLength;
    }
}
