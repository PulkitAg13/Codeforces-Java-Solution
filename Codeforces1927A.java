import java.util.Scanner;

public class Codeforces1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int l = -1, r = -1;

            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == 'B') {
                    if(l == -1) l = i;
                    r = i;
                }
            }

            System.out.println(r - l + 1);
        }
    }
}
