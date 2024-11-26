import java.util.Scanner;

public class Manuevering {
    static int numofpaths(int n, int m) {
        int d[] = new int[n];
        d[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                d[j] += d[j - 1];
            }
        }
        return d[n - 1];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(numofpaths(n, m));
        sc.close();

    }
}