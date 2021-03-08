import java.util.HashMap;
import java.util.Map;

public class WarmUpChallenges {

    /* Sales by Match */
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i : ar)
            socks.put(i, socks.get(i) == null ? 1 : socks.get(i)+1);
        int numberOfPairs = 0;
        for (int i : socks.values())
            numberOfPairs += i/2;
        return numberOfPairs;
        // return socks.values().stream().mapToInt(i -> i/2).sum();
        // return socks.values().stream().collect(Collectors.summingInt(i -> i/2));
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
    
}