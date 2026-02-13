import java.util.Scanner;

public class Codeforces141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < guest.length(); i++) {
            freq[guest.charAt(i) - 'A']++;
        }

        for (int i = 0; i < host.length(); i++) {
            freq[host.charAt(i) - 'A']++;
        }

        for (int i = 0; i < pile.length(); i++) {
            freq[pile.charAt(i) - 'A']--;
        }

        boolean ok = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
