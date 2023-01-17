package google;

import java.util.HashMap;

public class LargestNumberDivisibleByThree {
    public static void main(String[] args) {
        int[] digits1 = {3,1,4,1};
        int[] digits2 = {3, 1, 4, 1, 5, 9};
        int[] digits3 = {3, 1, 4, 1};
        int[] digits4 = {3, 1, 4, 1, 5, 9};

        double startTime = System.currentTimeMillis();
        System.out.println(solution(digits1));
        System.out.println(solution(digits2));
        System.out.println(solution(digits3));
        System.out.println(solution(digits4));
        double endTime = System.currentTimeMillis();
        System.out.println("Took "+(endTime - startTime) + " ms");
    }
    public static int solution(int[] L) {
        int sum = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : L) {
            sum += i;
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int remainder = sum % 3;
        if (remainder != 0) {
            for (int i : L) {
                if (i % 3 == remainder && count.get(i) > 0) {
                    count.put(i, count.get(i) - 1);
                    remainder = 0;
                    break;
                }
            }
            if (remainder != 0) {
                for (int i : L) {
                    if (i % 3 == remainder % 3 && count.get(i) > 1) {
                        count.put(i, count.get(i) - 2);
                        remainder = 0;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int c = count.getOrDefault(i, 0);
            sb.append(String.valueOf(i).repeat(Math.max(0, c)));
        }
        String result = sb.toString();
        return result.isEmpty() || remainder != 0 ? 0 : Integer.parseInt(result);
    }
}

