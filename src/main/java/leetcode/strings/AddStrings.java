package leetcode.strings;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("123", "456"));
        System.out.println(addStrings("123", "4567"));
        System.out.println(addStrings("123", "45678"));
        System.out.println(addStrings("123", "456789"));
        System.out.println(addStrings("123", "4567890"));
    }
    public static String addStrings(String num1, String num2) {
        if(num1 == null || num2 == null) return "";

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        int num1Index = num1.length() -1;
        int num2Index = num2.length() -1;

        while(carry != 0 || num1Index >=0 || num2Index >= 0){
            int firstNumber = num1Index >= 0 ? Character.getNumericValue(num1.charAt(num1Index)) : 0;
            int secondNumber = num2Index >= 0 ? Character.getNumericValue(num2.charAt(num2Index)) : 0;

            int sum = carry + firstNumber + secondNumber;

            if(sum > 9){
                int remainder = sum % 10;
                carry = 1;
                sb.append(remainder);
            }else{
                sb.append(sum);
                carry = 0;
            }

            num1Index--;
            num2Index--;
        }

        return sb.reverse().toString();
    }
}
