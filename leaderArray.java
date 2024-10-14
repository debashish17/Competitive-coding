import java.util.*;

public class leaderArray {
    static ArrayList<Integer> findLeader(int a[], int n) {
        ArrayList<Integer> leader = new ArrayList<>();
        int maxel = a[n - 1];
        leader.add(maxel);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] >= maxel) {
                System.out.print(maxel);
                leader.add(a[i]);
                maxel = a[i];
            }
        }
        Collections.reverse(leader);
        return leader;
    }

    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> leader = findLeader(a, n);
        for (int x : leader) {
            System.out.print(x + " ");
        }
        sc.close();

    }

}
