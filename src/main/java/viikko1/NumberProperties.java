package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        // Nollan tarkistus
        if (n == 0) {
            return "nolla";
        }

        // Parillisuuden tarkistus
        boolean even = (n % 2 == 0);

        // Positiivisuuden tai negatiivisuuden tarkistus
        if (n > 0) {
            return even ? "positiivinen parillinen" : "positiivinen pariton";
        } else {
            return even ? "negatiivinen parillinen" : "negatiivinen pariton";
        }
    }
}
