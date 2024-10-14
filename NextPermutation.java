import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation

{
    static int[] Permutation(int[] a, int n) {
        int b[] = a;
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[0] != b[n - 1]) {
                for (int k = n - 2; k >= 0; k--) {
                    if (a[i] == b[k]) {
                        a[0] = b[k + 1];
                        Arrays.sort(a);
                    }
                }
            }
            for (int j = n - 1; j > 1; j--) {
                if (a[j] > a[j - 1]) {
                    continue;
                }
                swap(a, j, j - 1);
            }

        }
        for (int x : b) {
            System.out.print(x);
        }

        return a;
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a = Permutation(a, n);
        for (int x : a) {
            System.out.print(x);
        }
        sc.close();
    }
}