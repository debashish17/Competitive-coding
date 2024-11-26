import java.util.Scanner;

class Activityselection {
    public static void printMaxActivities(int s[], int f[], int n) {
        int i, j;
        System.out.println("Following activities are selected");

        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of activities: ");
        int n = scanner.nextInt();

        int[] s = new int[n];
        int[] f = new int[n];

        System.out.println("Enter the start times of the activities:");
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        System.out.println("Enter the finish times of the activities:");
        for (int i = 0; i < n; i++) {
            f[i] = scanner.nextInt();
        }

        printMaxActivities(s, f, n);

        scanner.close();
    }
}
