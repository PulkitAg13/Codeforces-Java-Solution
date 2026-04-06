import java.util.Scanner;

public class Codeforces2126A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int x = sc.nextInt();
            String s = String.valueOf(x);

            int min = 9;

            for(int i = 0; i < s.length(); i++) {
                int d = s.charAt(i) - '0';
                if(d < min) min = d;
            }

            System.out.println(min);
        }
    }
}
