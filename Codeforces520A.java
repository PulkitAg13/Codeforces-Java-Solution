import java.util.HashSet;
import java.util.Scanner;

public class Codeforces520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String s = sc.nextLine().toLowerCase();

        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
