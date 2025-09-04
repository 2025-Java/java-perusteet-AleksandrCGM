package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int x = a, y = b, z = c;

        // Ensimmäinen vertailu
        if (x > y) {
            int t = x; x = y; y = t;
        }
        // Toinen vertailu
        if (y > z) {
            int t = y; y = z; z = t;
        }
        // Kolmas vertailu 
        if (x > y) {
            int t = x; x = y; y = t;
        }
        return x + "," + y + "," + z;
    }
}
