package foobar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ChallengeThree {
    public static int solution(String minionId, int base) {
        HashMap<String, Integer> seenMinionIds = new HashMap<>();
        int currentIndex = 0;
        while (!seenMinionIds.containsKey(minionId)) {
            seenMinionIds.put(minionId, currentIndex);
            minionId = getNextMinionId(minionId, base);
            currentIndex++;
        }
        return currentIndex - seenMinionIds.get(minionId);
    }

    private static String getNextMinionId(String minionId, int base) {
        ArrayList<Character> sortedMinionId = new ArrayList<>();
        for (char digit : minionId.toCharArray()) {
            sortedMinionId.add(digit);
        }
        ArrayList<Character> reversedMinionId = new ArrayList<>(sortedMinionId);
        Collections.sort(sortedMinionId);
        Collections.sort(reversedMinionId, Collections.reverseOrder());
        return intToString(stringToInt(reversedMinionId, base) - stringToInt(sortedMinionId, base), base, minionId.length());
    }

    private static int stringToInt(ArrayList<Character> digits, int base) {
        int result = 0;
        for (char digit : digits) {
            result = result * base + Character.getNumericValue(digit);
        }
        return result;
    }

    private static String intToString(int number, int base, int length) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.append(number % base);
            number /= base;
        }
        while (result.length() < length) {
            result.append('0');
        }
        return result.reverse().toString();
    }
}