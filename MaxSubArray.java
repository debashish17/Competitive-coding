import java.util.Scanner;

public class MaxSubArray {
    static int ProductMax(int arr[], int n) {
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pre *= arr[i];
            suff *= arr[n - 1 - i];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pro = ProductMax(arr, n);
        System.out.println(pro);
        sc.close();
    }

}
