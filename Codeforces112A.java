import java.util.Scanner;       
public class Codeforces112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(1);
                return;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }
}
