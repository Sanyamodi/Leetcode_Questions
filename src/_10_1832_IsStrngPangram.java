import java.util.*;
public class _10_1832_IsStrngPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int[] price = new int[26];
            for (int i = 0; i < 26; i++) {
                price[i] = sc.nextInt();
            }

            String text = sc.next();
            boolean[] present = new boolean[26];

            // Mark existing letters
            for (char ch : text.toCharArray()) {
                present[ch - 'a'] = true;
            }

            int totalCost = 0;

            // Sum price of missing letters
            for (int i = 0; i < 26; i++) {
                if (!present[i]) {
                    totalCost += price[i];
                }
            }

            System.out.println(totalCost);
        }

    }
}
