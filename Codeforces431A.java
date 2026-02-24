import java.util.Scanner;

public class Codeforces431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();

        String s = sc.next();
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '1') total += a1;
            else if (ch == '2') total += a2;
            else if (ch == '3') total += a3;
            else if (ch == '4') total += a4;
        }

        System.out.println(total);
    }
}
