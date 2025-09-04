package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        final String PASSWORD = "java123";

        // Vain kolme ensimmäistä yritystä lasketaan 
        int limit = Math.min(tries == null ? 0 : tries.length, 3);

        for (int i = 0; i < limit; i++) {
            if (PASSWORD.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
