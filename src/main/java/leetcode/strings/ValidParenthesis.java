package leetcode.strings;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> chars = new Stack<>();

        int index = 0;

        for(;index<s.length();index++){
            char charAtI = s.charAt(index);

            if(charAtI == '(' || charAtI == '[' || charAtI == '{'){
                chars.push(charAtI);
            }
            else{
                if(chars.isEmpty()){
                    return false;
                }
                switch (charAtI) {
                    case (')') -> {
                        if (chars.peek() != '(') {
                            return false;
                        }
                        chars.pop();
                    }
                    case (']') -> {
                        if (chars.peek() != '[') {
                            return false;
                        }
                        chars.pop();
                    }
                    case ('}') -> {
                        if (chars.peek() != '{') {
                            return false;
                        }
                        chars.pop();
                    }
                }
            }
        }
        return chars.isEmpty();
    }
}
