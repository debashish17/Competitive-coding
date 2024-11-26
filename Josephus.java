import java.util.Scanner;

public class Josephus {
    public static int Jose(int n, int k) {
        if (n == 1)
            return 1;
        else {
            return (Jose(n - 1, k) + k - 1) % n + 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int w = Jose(n, k);
        System.out.println(w);
        sc.close();

    }

}
