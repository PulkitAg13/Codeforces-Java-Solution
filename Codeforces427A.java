import java.util.Scanner;

public class Codeforces427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int available = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == -1) {
                if (available > 0) {
                    available--;
                } else {
                    untreated++;
                }
            } else {
                available += x;
            }
        }

        System.out.println(untreated);
    }
}
