import java.util.Scanner;

public class Karatsuba {
    static int karat(int x, int y) {
        if (x < 10 || y < 10) {
            return x * y;
        }
        int m = Math.max(getdigits(x), getdigits(y));
        int halfm = m / 2;
        int powerof10 = (int) Math.pow(10, halfm);
        int a = x / powerof10;
        int b = x % powerof10;
        int c = y / powerof10;
        int d = y % powerof10;
        int ac = karat(a, c);
        int bd = karat(b, d);
        int abcd = karat(a + b, c + d);
        int r = ac * (int) Math.pow(10, 2 * halfm) + (abcd - ac - bd) * powerof10 + bd;
        return r;

    }

    static int getdigits(int z) {
        if (z == 0) {
            return 1;
        }
        int c = 0;
        while (z > 0) {
            c++;
            z = z / 10;
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = karat(x, y);
        System.out.println(product);
        sc.close();

    }

}
