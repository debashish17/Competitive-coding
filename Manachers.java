import java.util.Scanner;

public class Manachers {
    public static int manacAlgo(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String str = getModified(s);
        int len = str.length();
        int[] p = new int[len];
        int c = 0;
        int rb = 0;
        int maxlen = 0;
        int sindex = 0;

        for (int i = 0; i < len; i++) {
            int mirror = 2 * c - i;

            if (i < rb) {
                p[i] = Math.min(rb - i, p[mirror]);
            }
            int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);
            while (a < len && b >= 0 && str.charAt(a) == str.charAt(b)) {
                p[i]++;
                a++;
                b--;

            }
            if (i + p[i] > rb) {
                c = i;
                rb = i + p[i];
            }
            if (p[i] > maxlen) {
                maxlen = p[i];
                sindex = (i - maxlen) / 2;
            }
        }
        System.out.println("Longest Substring palindrone : " + s.substring(sindex, sindex + maxlen));
        return maxlen;

    }

    private static String getModified(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append("#");
        }

        return sb.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sr = sc.next();
        int len = manacAlgo(sr);
        System.out.println(len);
        sc.close();

    }

}
