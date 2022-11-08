package leetcode.strings;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
    public static String makeGood(String s) {
        if( s == null || s.length() < 2) return s;

        StringBuilder sb = new StringBuilder();

        for(int i =0; i < s.length(); i++){
            char current = s.charAt(i);
            if(i < s.length() -1){
                char next = s.charAt(i+1);
                if(isBadCombination(current,next)){
                    i++;
                    continue;
                }
            }
            if(!sb.isEmpty()){
                if(isBadCombination(current,sb.charAt(sb.length() -1))){
                    sb.deleteCharAt(sb.length() -1);
                    continue;
                }
            }

            sb.append(current);
        }
        return sb.toString();

    }
    private static boolean isBadCombination(char a, char b){
        if(Character.toUpperCase(a) != Character.toUpperCase(b)) return false;
        return !(Character.isUpperCase(a) & Character.isUpperCase(b)) && !(Character.isLowerCase(a) & Character.isLowerCase(b));
    }
}
