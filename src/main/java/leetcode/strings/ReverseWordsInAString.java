package leetcode.strings;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        //End
        int l = s.length() - 1;

        //Start at the end of the string and work to the start
        while(l >= 0){
            //Move until you meet a letter or number not a space then set that index to be the end of the word
            while(l >= 0 && s.charAt(l) == ' '){
                l--;
            }
            int end = l;
            //Move until you meet a space and set that index to be the start of the word
            while(l>=0 && s.charAt(l) != ' '){
                l--;
            }
            int start = l;
            //Add the word to the String Builder with a space after it
            if(end >=0){
                sb.append(s.substring(start+1,end+1));
                sb.append(' ');
            }
        }
        //Return the substring of the final string up to index -1 to account for the final space
        return sb.substring(0,sb.length()-1).toString();
    }
}
