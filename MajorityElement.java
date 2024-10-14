import java.util.Scanner;

public class MajorityElement {
    static int Majority(int a[], int n) {
        int candidate = 0, count = 0;
        for (int k : a) {
            if (count == 0) {
                candidate = k;
            }
            count += (k == candidate) ? 1 : -1;
        }
        count = 0;

        for (int k : a) {
            if (k == candidate) {
                count++;
            }
        }
        if (count > a.length / 2) {
            return candidate;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Majority(a, n);
        if (res != -1) {
            System.out.println(res);
        } else {
            System.out.println("No Majority Element");
        }
        sc.close();
    }

}
