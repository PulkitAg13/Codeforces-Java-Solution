import java.util.Scanner;

public class Codeforces1903A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long arr[] = new long[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            if(k == 1) {
                boolean ok = true;
                for(int i = 1; i < n; i++) {
                    if(arr[i] < arr[i - 1]) {
                        ok = false;
                        break;
                    }
                }

                if(ok) System.out.println("YES");
                else System.out.println("NO");
            } 
            else {
                System.out.println("YES");
            }
        }
    }
}
