import java.util.Scanner;

public class Codeforces110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7') cnt++;
        }

        String c = String.valueOf(cnt);
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != '4' && c.charAt(i) != '7') {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(cnt > 0 ? "YES" : "NO");
    }
}
