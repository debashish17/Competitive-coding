import java.util.Scanner;

public class Bitbalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();

            long a = 0;
            boolean possible = true;

            for (int i = 0; i <= 61; i++) {
                long mask = 1L << i;
                boolean bi = (b & mask) != 0;
                boolean ci = (c & mask) != 0;
                boolean di = (d & mask) != 0;

                if (!di) {
                    if (bi && !ci) {
                        possible = false;
                        break;
                    }
                } else {
                    if (bi != ci) {
                        possible = false;
                        break;
                    }
                    if (!bi && !ci) {
                        a |= mask;
                    }
                }
            }

            if (possible) {
                output.append(a).append("\n");
            } else {
                output.append("-1\n");
            }
        }

        System.out.print(output.toString());
    }
}
