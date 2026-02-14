import java.util.Scanner;

public class Codeforces155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = sc.nextInt();

        int best = first;
        int worst = first;
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x > best) {
                best = x;
                amazing++;
            } else if (x < worst) {
                worst = x;
                amazing++;
            }
        }

        System.out.println(amazing);
    }
}
