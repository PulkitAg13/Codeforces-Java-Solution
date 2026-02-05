import java.util.Scanner;

public class Codeforces1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean hard = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                hard = true;
                break;
            }
        }

        if (hard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
