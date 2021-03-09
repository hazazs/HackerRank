import java.util.HashMap;
import java.util.Map;

public class WarmUpChallenges {

    /* Sales by Match */
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        int numberOfPairs = 0;
        for (int i : ar) {
            socks.put(i, socks.get(i) == null ? 1 : socks.get(i)+1);
            if (socks.get(i)%2 == 0)
                numberOfPairs++;
        }
        return numberOfPairs;
    }

    /* Counting Valleys */
    public static int countingValleys(int steps, String path) {
        int numberOfValleys = 0;
        int altitude = 0;
        for (int i = 0; i < steps; i++) {
            altitude += path.charAt(i) == 'U' ? 1 : -1;
            if (altitude == 0 && path.charAt(i) == 'U')
                numberOfValleys++;
        }
        return numberOfValleys;
    }

    /* Jumping on the Clouds */
    static int jumpingOnClouds(int[] c) {
        int numberOfMinimumJumps = 0;
        for (int i = 0; i < c.length-1; i++) {
            numberOfMinimumJumps++;
            if (i+2 < c.length && c[i+2] == 0)
                i++;
        }
        return numberOfMinimumJumps;
    }

    /* Repeated String */
    static long repeatedString(String s, long n) {
        int numberOfAsFull = 0;
        if (s.length() <= n)
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == 'a')
                    numberOfAsFull++;
        int numberOfAsSub = 0;
        for (int i = 0; i < n%s.length(); i++)
            if (s.charAt(i) == 'a')
                numberOfAsSub++;
        return n/s.length()*numberOfAsFull + numberOfAsSub;
    }

}