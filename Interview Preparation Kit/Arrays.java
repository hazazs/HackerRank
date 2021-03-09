public class Arrays {

    /* 2D Array - DS */
    static int hourglassSum(int[][] arr) {
        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                maxHourglassSum = Math.max(maxHourglassSum,
                    arr[i][j]   + arr[i][j+1]   + arr[i][j+2] +
                                  arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
        return maxHourglassSum;
    }

    /* Arrays: Left Rotation */
    static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++)
            rotated[i] = a[(i+d)%a.length];
        return rotated;
    }

}