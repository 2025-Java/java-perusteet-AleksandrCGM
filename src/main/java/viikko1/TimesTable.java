package viikko1;

public class TimesTable {
    public static String table(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 10; i++) {
            sb.append (n)
              .append(" x ")
              .append(i)
              .append(" = ")
              .append(n * i)
              .append("\n");
        }
        return sb.toString();
    }
}
