package leetcode.strings;

import java.util.*;

public class GroupedAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> grouped = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);

            if(!grouped.containsKey(sorted)){
                grouped.put(sorted,new ArrayList<>());
            }
            grouped.get(sorted).add(str);
        }
        return new ArrayList<>(grouped.values());

    }
}
