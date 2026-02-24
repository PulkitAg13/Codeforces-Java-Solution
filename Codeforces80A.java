import java.util.Scanner;

public class Codeforces80A {
    static boolean check(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int next = n + 1;

        while (true) {
            if (check(next)) {
                break;
            }
            next++;
        }

        if (next == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
