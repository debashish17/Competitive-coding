import java.util.Scanner;

public class Hourglass {
    static int maxsum(int a[][], int row, int col) {
        if (row < 3 || col < 3) {
            System.out.println("Hourglass not possible");
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
                        + a[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int res = maxsum(mat, row, col);
        if (res != Integer.MIN_VALUE) {
            System.out.println(res);
        }
        sc.close();
    }

}
