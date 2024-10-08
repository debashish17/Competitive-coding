import java.util.Scanner;

public class MaxEquilibrium {
    static int findMaxEquilibrium(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int p_sum = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            p_sum += arr[i];
            if (sum == p_sum) {
                res = Math.max(res, p_sum);
            }
            sum -= arr[i];
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = findMaxEquilibrium(arr, n);
        if (res != Integer.MIN_VALUE) {
            System.out.println(res);
        } else {
            System.out.println("No Equilibrium found");
        }
        sc.close();

    }

}
