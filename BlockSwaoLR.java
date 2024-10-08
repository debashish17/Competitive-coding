import java.util.Scanner;

public class BlockSwaoLR {
    static int[] blockswap(int arr[], int k, int n) {
        if (k == 0 || n == 0) {
            return arr;
        }
        if (k > n) {
            k %= n;
        }
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = blockswap(arr, k, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
