import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lexicograph {
    static String makepalindrone(TreeMap<Character, Integer> hm) {
        int c = 0;
        String prefix = "";
        String oddStr = "";
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            int itr = e.getValue() / 2;
            for (int i = 0; i < itr; i++) {
                prefix = prefix + e.getKey();
            }
            if (e.getValue() % 2 == 1) {
                oddStr += e.getKey();
                c++;
            }
            if (c > 1) {
                return "Cant make palindrone";
            }

        }
        String suffix = new StringBuilder(prefix).reverse().toString();
        return prefix + oddStr + suffix;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (char e : ch) {
            hm.put(e, hm.getOrDefault(e, 0) + 1);
        }
        System.out.println(makepalindrone(hm));
        sc.close();
    }

}
