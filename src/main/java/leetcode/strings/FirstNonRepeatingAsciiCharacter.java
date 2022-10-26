package leetcode.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingAsciiCharacter {
    public static void main(String[] args) {
        String s = "bbdbdbdbdjzkzk";
        System.out.println(firstUniqueChar(s));
    }
    public static Character firstUniqueChar(String s){
        Set<Character> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                continue;
            }
            else if(list.contains(c)){
                list.remove((Character) c);
                set.add(c);
            }
            else{
                list.add(c);
            }

        }
        return list.isEmpty()? null: list.get(0);
    }



}
