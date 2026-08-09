public class PasswordChecker {

    static String strength(String pw) {

        int count = 0;

        // Length >= 8
        if (pw.length() >= 8) {
            System.out.println("Length: Passed");
            count++;
        } else {
            System.out.println("Length: Failed");
        }

        // Uppercase letter
        if (pw.matches(".*[A-Z].*")) {
            System.out.println("Uppercase: Passed");
            count++;
        } else {
            System.out.println("Uppercase: Failed");
        }

        // Digit
        if (pw.matches(".*[0-9].*")) {
            System.out.println("Digit: Passed");
            count++;
        } else {
            System.out.println("Digit: Failed");
        }

        // Special character
        if (pw.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Special character: Passed");
            count++;
        } else {
            System.out.println("Special character: Failed");
        }

        if (count <= 1) {
            return "Weak";
        } else if (count <= 3) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        String[] passwords = {
            "abc",
            "Abcd1234!"
        };

        for (String pw : passwords) {

            System.out.println("\nPassword: " + pw);

            String result = strength(pw);

            System.out.println("Strength: " + result);
        }
    }
}