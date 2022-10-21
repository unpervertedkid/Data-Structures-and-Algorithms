package google;

import java.util.Arrays;

public class ElevatorMaintenance {
    public static void main(String[] args) {
        String[] input = new String[] {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        String[] result = solution(input);
        System.out.println(Arrays.toString(result));
    }
    public static String[] solution(String[] l) {

        Arrays.sort(l, (s1, s2) -> {

            final String[] s1versions = s1.split("\\.");
            final String[] s2versions = s2.split("\\.");

            int majorVersionComparison = compareByVersionType(s1versions, s2versions, 0);
            if (majorVersionComparison != 0) {
                return majorVersionComparison;
            }
            int minorVersionComparison = compareByVersionType(s1versions, s2versions, 1);
            if (minorVersionComparison != 0) {
                return minorVersionComparison;
            }
            int revisionVersionComparison = compareByVersionType(s1versions, s2versions, 2);
            if (revisionVersionComparison != 0) {
                return revisionVersionComparison;
            }
            return s1versions.length - s2versions.length;
        });

        return l;
    }

    private static int compareByVersionType(String[] s1versions, String[] s2versions, int versionType) {

        final int version1 = versionType >= s1versions.length ? 0 : Integer.parseInt(s1versions[versionType]);
        final int version2 = versionType >= s2versions.length ? 0 : Integer.parseInt(s2versions[versionType]);

        return version1 - version2;
    }

}
