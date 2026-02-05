import java.util.Scanner;

public class Codeforces344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            String cur = sc.next();
            if (!cur.equals(prev)) {
                cnt++;
            }
            prev = cur;
        }

        System.out.println(cnt);
    }
}
