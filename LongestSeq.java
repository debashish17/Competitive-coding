import java.util.Scanner;

public class LongestSeq {
    static int findlongestSequence(int n, int k) {
        String str = Integer.toBinaryString(n);
        int maxOne = Integer.MIN_VALUE;
        int nseq = 0;
        int ws = 0;
        for (int we = 0; we < str.length(); we++) {
            if (str.charAt(we) == '0') {
                nseq++;
            }
            while (nseq > k) {
                if (str.charAt(ws) == '0') {
                    nseq--;
                }
                ws++;
            }
            maxOne = Math.max(maxOne, we - ws + 1);
        }
        return maxOne;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = findlongestSequence(n, 1);
        System.out.println(m);
        sc.close();
    }

}
