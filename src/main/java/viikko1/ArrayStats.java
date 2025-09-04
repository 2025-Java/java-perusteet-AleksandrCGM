package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double) sum / arr.length;
    }
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > best) {
                best = arr[i];
            }
        }
        return best;
    }
}
