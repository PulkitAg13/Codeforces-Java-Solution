import java.util.Scanner;

public class Codeforces1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char firstA = a.charAt(0);
            char firstB = b.charAt(0);

            String newA = firstB + a.substring(1);
            String newB = firstA + b.substring(1);

            System.out.println(newA + " " + newB);
        }
    }
}
