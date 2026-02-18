import java.util.Scanner;

public class Codeforces1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String s = "codeforces";

        while (t-- > 0) {
            char ch = sc.next().charAt(0);

            if (s.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
