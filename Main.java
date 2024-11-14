import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim(); // Trim any leading/trailing spaces
        System.out.println(isSPalindrome(s) ? "TAK" : "NIE");
        scanner.close();
    }

    private static boolean isSPalindrome(String s) {
        int length = s.length();
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            // Convert both characters to lowercase for case insensitivity
            char leftChar = Character.toLowerCase(s.charAt(i));
            char rightChar = Character.toLowerCase(s.charAt(length - 1 - i));

            // Compare characters from start and end
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }
}
